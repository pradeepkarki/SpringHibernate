package com.luv2code.springdemo.annotation_methodinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")

@Component
public class TennisCoachImpl implements ICoach {

	private IFortuneService fortuneService;

	// Default constructor
	public TennisCoachImpl() {
		System.out.println(">> inside default constructor");
	}

	@Autowired
	public void methodInjection(IFortuneService fortuneService1) {
		System.out.println("TennisCoachImpl: inside methodInjection() method ");
		fortuneService = fortuneService1;
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
