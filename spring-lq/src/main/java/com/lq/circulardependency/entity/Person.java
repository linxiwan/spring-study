package com.lq.circulardependency.entity;

/**
 * @program: spring
 * @description:
 * @author: linqian
 * @create: 2021-07-06 15:08
 **/
public class Person {
	private String name;
	private int age;

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
