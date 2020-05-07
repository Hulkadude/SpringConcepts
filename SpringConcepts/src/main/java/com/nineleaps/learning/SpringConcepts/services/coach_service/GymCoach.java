package com.nineleaps.learning.SpringConcepts.services.coach_service;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

public class GymCoach implements Coach {
	
	private FeedbackService feedbackService;
	
	public GymCoach(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	public GymCoach() {}
	
	public String getDailyWorkout(){
		return "Do 500 skipping in 5 min..!!";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
	}

	public void setFeedbackService(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	
}
