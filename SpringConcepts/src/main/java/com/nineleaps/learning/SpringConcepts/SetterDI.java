package com.nineleaps.learning.SpringConcepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");

		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFeedback());
		System.out.println(coach.getDetails());
		
		StaticDateManager staticDateManager = context.getBean("staticDateMethod",StaticDateManager.class);
		System.out.println("Using Static Factory Method : "+staticDateManager.getDate());
		
		DateManager dateManager = context.getBean("createDateInstance",DateManager.class);
		System.out.println("Using Instance Factory Method : "+dateManager.getDate());
		
		
		
	}

}
