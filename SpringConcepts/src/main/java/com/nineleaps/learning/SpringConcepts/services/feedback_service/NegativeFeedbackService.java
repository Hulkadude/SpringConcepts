package com.nineleaps.learning.SpringConcepts.services.feedback_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:properties/feedback.properties")
public class NegativeFeedbackService implements FeedbackService {

	@Value("${coach.naive.feedback}")
	private String feedback;
	
	public String getFeedback() {
		return feedback;
	}

}
