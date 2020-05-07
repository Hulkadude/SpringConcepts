package com.nineleaps.learning.SpringConcepts.services.coach_service.JavaConfigBased;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

public class SwimCoach implements Coach {
	
	private FeedbackService feedbackService;
	
	public SwimCoach(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	public String getDailyWorkout(){
		return "Spend 30 min doing back stroke...!!";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
	}
}
