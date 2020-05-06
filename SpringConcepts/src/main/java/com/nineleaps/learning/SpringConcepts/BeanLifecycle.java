package com.nineleaps.learning.SpringConcepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycle {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/Bean_Lifecycle.xml");
		
		Coach coach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		//((ConfigurableApplicationContext)context).close();
		
	}

}
