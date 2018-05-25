package com.luv2code.springdemo.annotation_methodinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.annotation_constructorInjection.IFortuneService;

//@Component("myTennisCoach")

@Component
public class TennisCoachImpl implements ICoach {

	//Field injection
	@Autowired
	private IFortuneService fortuneService;

	// Default constructor
	public TennisCoachImpl() {
		System.out.println(">> inside default constructor");
	}
	
	/*//@Autowired
	 *method injection
	public void methodInjection(IFortuneService fortuneService1) {
		System.out.println("TennisCoachImpl: inside methodInjection() method ");
		fortuneService = fortuneService1;
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
