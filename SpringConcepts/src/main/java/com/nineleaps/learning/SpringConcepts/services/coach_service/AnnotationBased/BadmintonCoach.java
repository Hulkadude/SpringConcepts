package com.nineleaps.learning.SpringConcepts.services.coach_service.AnnotationBased;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	private FeedbackService feedbackService;
	
	public String getDailyWorkout() {
		return "Practice shuffling...!!";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
		//return feedbackService.getFeedback();
	}
	
	@Autowired
	public void setFeedbackService(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	
}
