package com.luv2code.springdemo.annotation_beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")

@Component
//@Scope("singleton")//points to the same object
//@Scope("prototype")//creates multiple objects
public class TennisCoachImpl implements ICoach {

	// field injection
	@Autowired
	@Qualifier("happyFortuneServiceImpl")
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
	
	@PostConstruct
	public void init()
	{
		System.out.println("Initializing stuff--->");
	}
	
	@PreDestroy
	public void destroyStuff()
	{
		System.out.println("Destroying stuff--->");
	}

}
