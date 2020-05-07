package com.nineleaps.learning.SpringConcepts.services.coach_service;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

public class BaseballCoach implements Coach {
	
	private FeedbackService feedbackService;
	
	public BaseballCoach(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	public String getDailyWorkout(){
		return "Spend 30 min on batting practice";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
	}
}
