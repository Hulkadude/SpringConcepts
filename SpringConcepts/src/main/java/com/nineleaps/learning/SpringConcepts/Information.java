package com.nineleaps.learning.SpringConcepts;

public class Information {
	private String email;
	private String team;
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String toString() {
		return "Email:"+email+"\nTeam:"+team;
	}
}
