package com.nineleaps.learning.SpringConcepts.services.feedback_service;

import org.springframework.beans.factory.annotation.Required;

public class ExpertFeedbackService implements FeedbackService {
	private String feedback;
	
	public String getFeedback() {
		return feedback;
	}

	@Required
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}	

}
