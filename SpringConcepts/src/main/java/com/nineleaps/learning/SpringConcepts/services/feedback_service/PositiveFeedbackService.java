package com.nineleaps.learning.SpringConcepts.services.feedback_service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PositiveFeedbackService implements FeedbackService {

	public String getFeedback() {
		return "Well Done ! You Did it!!";
	}

}
