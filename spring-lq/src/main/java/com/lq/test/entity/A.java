package com.lq.test.entity;

/**
 * @program: spring
 * @description: A
 * @author: linqian
 * @create: 2021-04-09 09:59
 **/
public class A {

	private String name;

	private int age;

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
}
