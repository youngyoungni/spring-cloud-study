package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供端
 * @author Youngni
 *
 */
@SpringBootApplication
@EnableEurekaClient			//本服务启动后会自动注册进 Eureka 服务中
public class DeptProvider8001_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
