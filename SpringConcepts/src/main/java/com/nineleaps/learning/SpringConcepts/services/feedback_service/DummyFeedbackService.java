package com.nineleaps.learning.SpringConcepts.services.feedback_service;

public class DummyFeedbackService implements FeedbackService {
	
	private static String feedback;
	
	public void setFeedback() {
		feedback = "This is my dummy feedback";
	}
	
	public static String getDummyFeedback() {
		return feedback;
	}

	public String getFeedback() {
		return feedback;
	}

}
