package com.nineleaps.learning.SpringConcepts.executors.annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class AnnotationBasedBeanScopeDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/AnnotationContext.xml");
		
		Coach coach1 = context.getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("Same Reference: "+(coach1==coach2)+"\ncoach1: "+coach1+"\ncouch2: "+coach2);
	}

}
