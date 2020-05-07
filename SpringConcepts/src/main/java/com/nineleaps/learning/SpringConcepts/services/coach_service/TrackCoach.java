package com.nineleaps.learning.SpringConcepts.services.coach_service;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

public class TrackCoach implements Coach {

	private FeedbackService feedbackService;

	public TrackCoach(FeedbackService feedbackService) {
		super();
		this.feedbackService = feedbackService;
	}

	public String getDailyWorkout() {
		return "Run a sprint of 5 Km";
	}

	public String getDailyFeedback() {
		return "Wooah..." + feedbackService.getFeedback();
	}

	public void customInit() {
		System.out.println("Startup");
	}

	public void customDestroy() {
		System.out.println("clean up");
	}

}
