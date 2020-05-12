package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class BeanFactoryDemo {

	public static void main(String[] args) throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext("configurations/Bean_Lifecycle.xml");
		
		Coach coach = factory.getBean("myTrackCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFeedback());
		
	}

}