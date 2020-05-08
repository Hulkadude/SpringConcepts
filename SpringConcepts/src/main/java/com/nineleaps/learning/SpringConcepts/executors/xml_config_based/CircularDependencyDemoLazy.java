package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.handler.ArbitraryClassA;
import com.nineleaps.learning.SpringConcepts.services.coach_service.CricketCoach;

public class CircularDependencyDemoLazy {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/CircularDependencyConfigLazy.xml");
		
		/*
		 * ArbitraryClassA arbitraryClassA =
		 * context.getBean("ArbitraryA",ArbitraryClassA.class);
		 * System.out.println(arbitraryClassA.getMessage());
		 */
		
	}

}
