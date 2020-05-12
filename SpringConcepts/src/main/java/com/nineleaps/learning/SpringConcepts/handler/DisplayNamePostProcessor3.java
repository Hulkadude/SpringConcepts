package com.nineleaps.learning.SpringConcepts.handler;

import javax.annotation.Priority;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Priority(Integer.MAX_VALUE)
public class DisplayNamePostProcessor3 implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In After bean Initialization method of DisplayNamePostProcessor3. Bean name is " + beanName
				+ " Priotity is " + getOrder());
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In Before bean Initialization method of DisplayNamePostProcessor3. Bean name is " + beanName
				+ " Priotity is " + getOrder());
		return bean;
	}

	public int getOrder() {
		return Integer.MAX_VALUE;
	}

}
