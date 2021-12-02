package com.lq.circulardependency;

import com.lq.circulardependency.entity.A;
import com.lq.circulardependency.entity.B;
import com.lq.circulardependency.entity.Person;
import org.springframework.context.ApplicationContext;
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
//		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		AbstractApplicationContext bd = new ClassPathXmlApplicationContext("applicationContext-${username}.xml");
		Person p = bd.getBean(Person.class);
		ApplicationContext ac = p.getAc();
		System.out.println(ac);

//		A a = bd.getBean(A.class);
//		B b = bd.getBean(B.class);
	}

}
