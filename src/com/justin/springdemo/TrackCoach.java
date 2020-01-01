package com.justin.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 10 Miles";
	}

	@Override
	public String getCoachName() {
		return "George";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
