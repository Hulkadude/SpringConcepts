package com.nineleaps.learning.SpringConcepts.handler;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Integer.MIN_VALUE)
public class DisplayNamePostProcessor4 implements BeanPostProcessor, Ordered {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In After bean Initialization method of DisplayNamePostProcessor4. Bean name is " + beanName
				+ " Priotity is " + getOrder());
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In Before bean Initialization method of DisplayNamePostProcessor4. Bean name is " + beanName
				+ " Priotity is " + getOrder());
		return bean;
	}

	public int getOrder() {
		return Integer.MIN_VALUE;
	}

}
