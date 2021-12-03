package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	public Feedback() {
		super();
	}
	@Id
	long Feedbackid;
	String Feedback;
	int  Rating;
	public long getFeedbackid() {
		return Feedbackid;
	}
	public void setFeedbackid(long feedbackid) {
		Feedbackid = feedbackid;
	}
	
	public Feedback(long feedbackid, String feedback, int rating) {
		super();
		Feedbackid = feedbackid;
		Feedback = feedback;
		Rating = rating;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}

}
