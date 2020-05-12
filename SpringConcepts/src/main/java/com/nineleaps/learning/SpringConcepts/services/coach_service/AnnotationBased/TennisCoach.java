package com.nineleaps.learning.SpringConcepts.services.coach_service.AnnotationBased;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

@Component
@Scope("singleton")							//Default scope
public class TennisCoach implements Coach {

	private FeedbackService feedbackService;
	
	
	@Inject
	public TennisCoach(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	public String getDailyWorkout() {
		return "Practice back hand for 50 min";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
	}
	
	@PostConstruct
	public void startup() {
		System.out.println("Starting up...!!");
	}
	
	@PreDestroy
	public void closeDown() {
		System.out.println("Closing down....!!");
	}
}
