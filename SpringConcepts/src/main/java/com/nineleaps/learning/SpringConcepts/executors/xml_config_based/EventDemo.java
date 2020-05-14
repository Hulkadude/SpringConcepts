package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.Events.EmailService;
import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class EventDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");

		EmailService emailService = context.getBean("emailService", EmailService.class);

		emailService.sendEmail("known.hacker@example.org", "This is blocked email");
		
		emailService.sendEmail("known.trusted@example.org", "This is blocked email");

	}

}
