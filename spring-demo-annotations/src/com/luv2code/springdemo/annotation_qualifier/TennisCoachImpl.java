package com.luv2code.springdemo.annotation_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")

@Component
public class TennisCoachImpl implements ICoach {

	// field injection
	@Autowired
	@Qualifier("randomFortuneServiceImpl")
	private IFortuneService fortuneService;

	// Default constructor
	public TennisCoachImpl() {
		System.out.println(">> inside default constructor");
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
