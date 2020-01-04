package com.justin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//Initialize spring container from XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Create objects from XML bean definitions
		Coach baseballCoach = context.getBean("bCoach", Coach.class);
		Coach trackCoach = context.getBean("tCoach", Coach.class);
		SoccerCoach soccerCoach = context.getBean("sCoach", SoccerCoach.class);
		
		//Methods and output
		System.out.println(baseballCoach.getCoachName() + "'s routine: " + baseballCoach.getDailyWorkout());
		System.out.println(trackCoach.getCoachName() + "'s routine: " + trackCoach.getDailyWorkout());
		System.out.println(soccerCoach.getCoachName() + "'s routine: " + soccerCoach.getDailyWorkout());
		
		System.out.println(trackCoach.getCoachName() + "'s fortune: " + trackCoach.getDailyFortune());
		System.out.println(baseballCoach.getCoachName() + "'s fortune: " + baseballCoach.getDailyFortune());
		System.out.println(soccerCoach.giveIntroduction());
		
		//compare objects to see effect of prototype vs singleton scope
		Coach protoBaseballCoach1 = context.getBean("bCoach", Coach.class);
		Coach protoBaseballCoach2 = context.getBean("bCoach", Coach.class);
		boolean areEqualProto = protoBaseballCoach1 == protoBaseballCoach2;
		System.out.println("\nPrototype scoped coaches are equal? " + areEqualProto + "\nMemory location of protoBaseballCoach1 " + protoBaseballCoach1 + "\nMemory location of protoBaseballCoach2" + protoBaseballCoach2);
		
		Coach trackCoach1 = context.getBean("tCoach", Coach.class);
		Coach trackCoach2 = context.getBean("tCoach", Coach.class);
		boolean areEqualSingleton = trackCoach1 == trackCoach2;
		System.out.println("\nSingleton scoped coaches are equal? " + areEqualSingleton + "\nMemory location of trackCoach1 " + trackCoach1 + "\nMemory location of trackCoach2" + trackCoach2);
		
		context.close();
	}

}
