package com.nineleaps.learning.SpringConcepts.executors.annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class AnnotationBasedConstructorDI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/AnnotationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFeedback());

		((ClassPathXmlApplicationContext)context).registerShutdownHook();

	}

}
