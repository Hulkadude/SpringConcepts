package com.nineleaps.learning.SpringConcepts.executors.annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackLister;

public class AnnotationBasedAutowiringFeedsDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/AnnotationContext.xml");

		FeedbackLister feedbackLister = context.getBean("feedbackLister", FeedbackLister.class);

		feedbackLister.getInformation();
	}

}
