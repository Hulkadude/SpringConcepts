package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class BeanLifecycle {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/Bean_Lifecycle.xml");
		
		Coach coach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}