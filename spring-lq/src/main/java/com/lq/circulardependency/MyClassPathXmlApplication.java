package com.lq.circulardependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @program: spring
 * @description:
 * @author: linqian
 * @create: 2021-07-06 16:20
 **/
public class MyClassPathXmlApplication extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplication(String ...configLocations){
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources........");
		Map<String, Object> systemEnvironment = getEnvironment().getSystemEnvironment();
		System.out.println(systemEnvironment.get("USERNAME"));
	}
}
