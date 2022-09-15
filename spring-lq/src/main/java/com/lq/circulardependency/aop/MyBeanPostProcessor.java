package com.lq.circulardependency.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: linqian
 * @Date: 2022/09/15/3:14 PM
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean,
												  String beanName) throws BeansException {
		System.out.println("==========BeanPostProcessorBefore==============");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean,
												 String beanName) throws BeansException {
		System.out.println("=============BeanPostProcessorAfter============");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
