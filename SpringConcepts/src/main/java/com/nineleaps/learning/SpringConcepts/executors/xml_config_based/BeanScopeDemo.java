package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("configurations/BeanScope.xml");
		/*
		 * GenericApplicationContext context = new GenericApplicationContext(); new
		 * GroovyBeanDefinitionReader(context).loadBeanDefinitions(
		 * "configurations/BeanScope.groovy");
		 */

		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("configurations/BeanScope.xml");
		context.refresh();
		
		Coach coach1 = context.getBean("myCustomScopeTrackCoach", Coach.class);
		Coach coach2 = context.getBean("myCustomScopeTrackCoach", Coach.class);

		System.out.println("Same Reference: " + (coach1 == coach2) + "\ncoach1: " + coach1 + "\ncouch2: " + coach2);
		
	}

}
