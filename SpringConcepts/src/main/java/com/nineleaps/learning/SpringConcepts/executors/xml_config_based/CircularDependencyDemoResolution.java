package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.handler.DemoClassB;

public class CircularDependencyDemoResolution {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"configurations/CircularDependencyConfigResolution.xml");
		DemoClassB demoClassB = context.getBean("DemoB", DemoClassB.class);
		
		System.out.println(demoClassB.getDemoClassA().getMessage());

	}

}
