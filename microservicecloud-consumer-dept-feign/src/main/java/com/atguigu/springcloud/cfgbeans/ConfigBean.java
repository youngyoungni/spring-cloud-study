package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * 	@author Youngni
 * 	boot->spring applicationContext.xml == @Configuration
 * 	注解版 配置文件
 */
@Configuration
public class ConfigBean {
	
	/**
	 * 	@LoadBalanced：	Spring Cloud Ribbon 是基于 Netflix Ribbon实现的一套客户端，负载均衡的工具
	 * 					默认采用轮询算法，一个一个的轮流。每个服务提供者轮流使用
	 * 					轮询、随机、响应时间加权
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		/*
		 * RestTemplate：	提供了多种便捷访问远程HTTP服务的方法；
		 * 					一种访问restful服务模板类；
		 * 					是Spring提供用于访问Rest服务的客户端模板的工具集。
		 * 	使用方式：
		 * 		只需三个参数 (url,requestMap,ResponseBean.class)
		 * 		url：		Rest请求地址
		 * 		requestMap：	请求参数
		 * 		ResponseBean：HTTP响应转换被转换成的对象类型	
		 */
		return new RestTemplate();
	} 
	
	
}
