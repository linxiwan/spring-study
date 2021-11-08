package com.lq.circulardependency.entity;

/**
 * @program: spring
 * @description: A
 * @author: linqian
 * @create: 2021-04-15 14:20
 **/
public class A {

	public A(B b) {
		this.b = b;
	}

	public A() {
	}

	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void show(){
		System.out.println("create bean success------A");
	}
}
