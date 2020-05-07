package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class BeanInheritenceAndAutowiringCollaborationDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");

		Coach coach = context.getBean("myGymCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFeedback());
		
	}

}
