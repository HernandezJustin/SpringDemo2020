package com.justin.springdemo;

public class SoccerCoach implements Coach {
	
	private String team;
	private String email;

	@Override
	public String getDailyWorkout() {
		return "Kick the ball around for an hour";
	}

	@Override
	public String getCoachName() {
		return "Sarah";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String giveIntroduction() {
		return "Hello, my name is Sarah and my soccer team is called: " + team + ". You can contact me by email at " + email;
	}

}
