package com.lq.circulardependency;

import com.lq.circulardependency.entity.Person;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
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
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AbstractApplicationContext bd = new ClassPathXmlApplicationContext("applicationContext-${username}.xml");
//		Person p = ac.getBean(Person.class);
//		ApplicationContext ac = p.getAc();
//		System.out.println(ac);

//		new XmlBeanFactory()

//		A a = bd.getBean(A.class);
//		B b = bd.getBean(B.class);
	}

}
