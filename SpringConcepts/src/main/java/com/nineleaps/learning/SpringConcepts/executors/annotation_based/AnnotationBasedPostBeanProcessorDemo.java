package com.nineleaps.learning.SpringConcepts.executors.annotation_based;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nineleaps.learning.SpringConcepts.handler.DisplayNamePostProcessor;
import com.nineleaps.learning.SpringConcepts.handler.DisplayNamePostProcessor2;
import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;

public class AnnotationBasedPostBeanProcessorDemo {

	public static void main(String[] args) {
		/*
		 * ConfigurableBeanFactory factory = new XmlBeanFactory( new
		 * FileSystemResource("src/main/resources/configurations/AnnotationContext.xml")
		 * );
		 */
		ApplicationContext factory = new ClassPathXmlApplicationContext("configurations/AnnotationContext.xml");
		// new ClassPathXmlApplicationContext("configurations/AnnotationContext.xml");
	//	factory.addBeanPostProcessor(new DisplayNamePostProcessor());
		//factory.addBeanPostProcessor(new DisplayNamePostProcessor2());
		Coach coach = factory.getBean("badmintonCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());

	}

}
