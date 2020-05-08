import com.nineleaps.learning.SpringConcepts.services.coach_service.TrackCoach
com.nineleaps.learning.SpringConcepts.services.feedback_service.NaiveFeedbackService

beans = {
    myGroovyTrackCoach(TrackCoach,myGroovyFeedback) {
    }
    
    myGroovyFeedback(NaiveFeedbackService) {
        feedback = ""I would also like to immitate...!!""
    }
    
}