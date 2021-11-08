package com.lq.circulardependency.entity;

/**
 * @program: spring
 * @description: b
 * @author: linqian
 * @create: 2021-04-15 14:20
 **/
public class B {

	public B(A a) {
		this.a = a;
	}

	public B() {
	}

	private A a ;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public void show(){
		System.out.println("create bean success------B");
	}
}
