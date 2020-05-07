package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.handler.DateManager;
import com.nineleaps.learning.SpringConcepts.handler.StaticDateManager;
import com.nineleaps.learning.SpringConcepts.services.coach_service.CricketCoach;

public class SetterDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");

		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFeedback());
		System.out.println(coach.getDetails());
		
		
		
	}

}
