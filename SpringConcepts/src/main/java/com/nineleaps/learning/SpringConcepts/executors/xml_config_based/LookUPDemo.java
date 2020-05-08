package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.FootballCoach;

public class LookUPDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");

		FootballCoach coach = context.getBean("myFootballCoach", FootballCoach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFeedback());

	}
}
