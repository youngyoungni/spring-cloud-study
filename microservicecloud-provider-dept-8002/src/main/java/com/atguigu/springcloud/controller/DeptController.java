package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

/**
 * 服务提供者
 * @author Youngni
 *
 */
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping( value = "/dept/add" , method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	}
	
	@RequestMapping( value = "/dept/get/{id}" , method = RequestMethod.GET)
	public Dept get(@PathVariable Long id) {
		return deptService.get(id);
	}
	
	@RequestMapping( value = "/dept/list" , method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}
	
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery() {
		// 服务发现
		// 微服务的集合
		List<String> list = client.getServices();
		System.out.println("**************"+ list);
		
		List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance serviceInstance : instances) {
			System.out.println(serviceInstance.getServiceId() + "\t" + serviceInstance.getHost() + 
					"\t" + serviceInstance.getPort() + "\t" + serviceInstance.getUri());
		}
		
		return this.client;
	}
	
}
