package com.lq.circulardependency.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @program: spring
 * @description:
 * @author: linqian
 * @create: 2021-07-06 15:08
 **/
public class Person implements ApplicationContextAware {
	private String name;
	private int age;
	private ApplicationContext ac;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ApplicationContext getAc() {
		return ac;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("applicationContext==============");
		this.ac = applicationContext;
	}
}
