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
	
	//method injection
	/*
	 * @Autowired public void methodInjection(IFortuneService fortuneService1) {
	 * System.out.println("TennisCoachImpl: inside methodInjection() method ");
	 * fortuneService = fortuneService1; }
	 */
	
	//setter injection
	/*@Autowired
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println(">> TennisCoachImpl : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
