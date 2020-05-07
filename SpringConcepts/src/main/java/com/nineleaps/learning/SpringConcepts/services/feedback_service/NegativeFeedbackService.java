package com.nineleaps.learning.SpringConcepts.services.feedback_service;

import org.springframework.stereotype.Component;

@Component
public class NegativeFeedbackService implements FeedbackService {

	public String getFeedback() {
		return "You are doing that wrong..";
	}

}
