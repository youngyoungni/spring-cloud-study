package com.atguigu.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Youngni
 * boot->spring applicationContext.xml == @Configuration
 * 注解版 配置文件
 */
@Configuration
public class ConfigBean {
	
	@Bean
	public RestTemplate getRestTemplate() {
		/*
		 * RestTemplate：	提供了多种便捷访问远程HTTP服务的方法；
		 * 					一种访问restful服务模板类；
		 * 					是Spring提供用于访问Rest服务的客户端模板的工具集。
		 * 使用方式：
		 * 		只需三个参数 (url,requestMap,ResponseBean.class)
		 * 		url：		Rest请求地址
		 * 		requestMap：	请求参数
		 * 		ResponseBean：HTTP响应转换被转换成的对象类型	
		 */
		return new RestTemplate();
	} 
}
