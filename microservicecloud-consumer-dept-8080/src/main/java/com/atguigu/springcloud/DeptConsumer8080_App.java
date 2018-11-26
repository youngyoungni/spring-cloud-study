package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.atguigu.ribbonrule.MySelfRule;

/**
 * @author Youngni
 *	服务消费端
 * 	@RibbonClient:	在启动该微服务的时候就去加载自定义 Ribbon 配置类，从而实现算法改变
 * 					注意 “自定义 Ribbon 配置类” 不能放在 @ComponentScan 注解相关包及子包一下
 * 					@SpringBootApplication 中包含 @ComponentScan
 * 					故 “自定义 Ribbon 配置类” 不能在 “com.atguigu.springcloud” 包及子包一下
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT", configuration=MySelfRule.class)
public class DeptConsumer8080_App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer8080_App.class, args);
	}

}
