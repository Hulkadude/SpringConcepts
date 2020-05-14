package com.nineleaps.learning.SpringConcepts.executors.annotation_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nineleaps.learning.SpringConcepts.configuration.ApplicationConfig;
import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class AnnotationConfigApplicationContextDemo {
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	    context.register(ApplicationConfig.class);
	    context.refresh();
	    Coach coach = context.getBean("swimCoach", Coach.class);
		  System.out.println(coach.getDailyWorkout());
		  System.out.println(coach.getDailyFeedback());
	}

}
