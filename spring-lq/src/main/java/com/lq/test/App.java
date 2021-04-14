package com.lq.test;

import com.lq.test.entity.A;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description: App
 * @author: linqian
 * @create: 2021-04-09 09:51
 **/
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = context.getBean(A.class);
		System.out.println(a.getName()+"============="+a.getAge());

	}
}
