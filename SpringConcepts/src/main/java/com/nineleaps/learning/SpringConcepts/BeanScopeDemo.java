package com.nineleaps.learning.SpringConcepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/BeanScope.xml");
		
		Coach coach1 = context.getBean("myTrackCoach", Coach.class);
		Coach coach2 = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println("Same Reference: "+(coach1==coach2)+"\ncoach1: "+coach1+"\ncouch2: "+coach2);
	}

}
