package com.justin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//Initialize spring container from XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Create objects from XML bean definitions
		Coach baseballCoach = context.getBean("bCoach", Coach.class);
		Coach trackCoach = context.getBean("tCoach", Coach.class);
		Coach soccerCoach = context.getBean("sCoach", Coach.class);
		
		//Methods and output
		System.out.println(baseballCoach.getCoachName() + "'s routine: " + baseballCoach.getDailyWorkout());
		System.out.println(trackCoach.getCoachName() + "'s routine: " + trackCoach.getDailyWorkout());
		System.out.println(soccerCoach.getCoachName() + "'s routine: " + soccerCoach.getDailyWorkout());
		
		System.out.println(trackCoach.getCoachName() + "'s fortune: " + trackCoach.getDailyFortune());
		System.out.println(baseballCoach.getCoachName() + "'s fortune: " + baseballCoach.getDailyFortune());
		
		context.close();
	}

}
