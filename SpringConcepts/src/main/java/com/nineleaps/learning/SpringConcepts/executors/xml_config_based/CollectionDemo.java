package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.DummyCoach;
import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class CollectionDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");

		DummyCoach coach = context.getBean("myDummyCoach", DummyCoach.class);
		
		coach.getProperties();
		coach.getContactDetails();
		coach.getTeams();
		coach.getFeedbacks();
		
	}

}
