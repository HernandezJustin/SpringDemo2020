package com.justin.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You will have a happy day today.";
	}

}
