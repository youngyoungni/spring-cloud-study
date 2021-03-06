package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;

/**
 * 服务消費者控制器
 * @author Youngni
 *
 */
@RestController
public class DeptController_Consumer {
	
	// 单机版	private static final String REST_URL_PREFIX = "http://localhost:8001";
	// 集群版，按微服务名称访问服务地址，不需要在担心服务的地址(URL)和端口（port）
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping( value="/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add"
				, dept, Boolean.class);
	}
	
	@RequestMapping( value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id
				, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping( value="/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list"
				, List.class);
	}
	
	// 测试 @EnableDiscoveryClient,消费端可以调用服务发现
	@RequestMapping(value = "/consumer/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery"
				, Object.class);
	}
}
