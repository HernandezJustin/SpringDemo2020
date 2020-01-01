package com.justin.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getCoachName() {
		return "Ron";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
