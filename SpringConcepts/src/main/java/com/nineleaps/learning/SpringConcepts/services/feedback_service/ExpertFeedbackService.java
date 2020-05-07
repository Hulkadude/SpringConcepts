package com.nineleaps.learning.SpringConcepts.services.feedback_service;

public class ExpertFeedbackService implements FeedbackService {
	private String feedback;
	
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}	

}
