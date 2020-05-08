package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.handler.DateManager;
import com.nineleaps.learning.SpringConcepts.handler.StaticDateManager;
import com.nineleaps.learning.SpringConcepts.handler.StaticInnerClass;
import com.nineleaps.learning.SpringConcepts.services.coach_service.CricketCoach;

public class FactoryMethodsDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");
		
		StaticDateManager staticDateManager = context.getBean("staticDateMethod",StaticDateManager.class);
		System.out.println("Using Static Factory Method : "+staticDateManager.getDate());
		
		DateManager dateManager = context.getBean("createDateInstance",DateManager.class);
		System.out.println("Using Instance Factory Method : "+dateManager.getDate());
		
		StaticInnerClass.DateProvider dateProvider = context.getBean("innerStaticClass",StaticInnerClass.DateProvider.class);
		System.out.println("Using inner static class : "+dateProvider.getDate());
		
	}

}
