package com.luv2code.springdemo.annotation_fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.annotation_methodinjection.IFortuneService;

//@Component("myTennisCoach")

@Component
public class TennisCoachImpl implements ICoach {

	// Field injection
	/*
	 * This happen due to java technology called Reflection
	 */
	@Autowired
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
