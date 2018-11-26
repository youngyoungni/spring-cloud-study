package com.atguigu.ribbonrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RandomRule;
//import com.netflix.loadbalancer.RoundRobinRule;

/**
 * 
 * 	@author Youngni
 *	自定义 Ribbon 配置类
 */
@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule() {
//		return new RandomRule();		设置随机算法
//		return new RoundRobinRule();	ribbon默认轮询
		return new RandomRule_ZY();		// 自定义算法
	}
}
