package com.justin.springdemo;

public class SoccerCoach implements Coach {

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

}
