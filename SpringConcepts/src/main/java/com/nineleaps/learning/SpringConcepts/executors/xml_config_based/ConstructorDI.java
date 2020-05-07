package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class ConstructorDI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");
		//Alternatively
		//ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/utkar/git/SpringConcepts/SpringConcepts/src/main/resources/configurations/applicationContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/configurations/applicationContext.xml");
		
		  Coach coach = context.getBean("myBaseballCoach", Coach.class);
		  System.out.println(coach.getDailyWorkout());
		  System.out.println(coach.getDailyFeedback());
		 

	}

}
