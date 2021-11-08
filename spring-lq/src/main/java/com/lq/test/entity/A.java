package com.lq.test.entity;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @program: spring
 * @description: A
 * @author: linqian
 * @create: 2021-04-09 09:59
 **/
public class A implements BeanNameAware, EnvironmentAware {

	private String name;

	private int age;

	private String beanName;

	private Environment environment;

	public A() {
	}

	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public void setBeanName(String name) {
		this.beanName=name;
	}

	public String getBeanName() {
		return beanName;
	}

	public Environment getEnvironment() {
		return environment;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment=environment;
	}
}
