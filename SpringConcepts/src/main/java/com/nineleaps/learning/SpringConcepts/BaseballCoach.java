package com.nineleaps.learning.SpringConcepts;

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
