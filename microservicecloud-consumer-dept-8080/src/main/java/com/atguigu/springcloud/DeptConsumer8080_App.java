package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Youngni
 *	服务消费端
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer8080_App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer8080_App.class, args);
	}

}
