package com.lq.circulardependency;

import com.lq.circulardependency.entity.A;
import com.lq.circulardependency.entity.B;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description: Main
 * @author: linqian
 * @create: 2021-04-15 14:38
 **/
public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//AbstractApplicationContext bd = new MyClassPathXmlApplication("applicationContext-${username}.xml");

		A a = ac.getBean(A.class);
		B b = ac.getBean(B.class);
	}

}
