package com.lq.circulardependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

/**
 * @program: spring
 * @description: 自定义BeanFactoryPostProcessor
 * @author: linqian
 * @create: 2022-09-13 22:53
 **/
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(new StringValueResolver() {
				@Override
				public String resolveStringValue(String strVal) {
					return strVal=="testBeanFactory"?strVal:"*******";
				}
			});
			visitor.visitBeanDefinition(beanDefinition);
		}
	}
}
