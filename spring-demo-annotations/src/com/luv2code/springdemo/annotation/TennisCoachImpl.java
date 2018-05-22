package com.luv2code.springdemo.annotation;

import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
public class TennisCoachImpl implements ICoach {

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

}
