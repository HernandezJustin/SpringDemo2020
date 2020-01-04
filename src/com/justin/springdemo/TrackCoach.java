package com.justin.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fs;
	
	public TrackCoach(FortuneService fs) {
		this.fs = fs;
	}

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
		return fs.getFortune();
	}
	
	public void startupInit() {
		System.out.println("Init called");
	}
	
	public void deInit() {
		System.out.println("Destroy called");
	}
}
