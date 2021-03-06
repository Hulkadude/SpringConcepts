package com.nineleaps.learning.SpringConcepts.services.coach_service.AnnotationBased;

import javax.annotation.Resource;
import javax.inject.Named;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

@Named
public class HockeyCoach implements Coach {

	private FeedbackService feedbackService;
	
	public String getDailyWorkout() {
		return "Practice shuffling with hockey stick...!!";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
		//return feedbackService.getFeedback();
	}
	
	@Resource(name="negativeFeedbackService")
	public void setFeedbackService(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	
}
