package com.nineleaps.learning.SpringConcepts.executors.java_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nineleaps.learning.SpringConcepts.configuration.ApplicationConfig;
import com.nineleaps.learning.SpringConcepts.configuration.ComponentScanBasedApplicationConfig;
import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class JavaBasedConfigDemo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Coach coach = context.getBean("swimCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFeedback());

	}

}
