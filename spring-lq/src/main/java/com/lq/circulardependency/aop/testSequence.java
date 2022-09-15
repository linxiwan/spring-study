package com.lq.circulardependency.aop;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: linqian
 * @Date: 2022/09/15/3:13 PM
 */
public class testSequence implements InitializingBean {


	public void init(){
		System.out.println("==============init==============");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("=======afterPropertiesSet========");
	}
}
