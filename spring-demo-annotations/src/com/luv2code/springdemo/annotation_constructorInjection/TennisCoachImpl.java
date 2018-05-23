package com.luv2code.springdemo.annotation_constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")

@Component
public class TennisCoachImpl implements ICoach {

	private final IFortuneService fortuneService;

	@Autowired
	public TennisCoachImpl(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
