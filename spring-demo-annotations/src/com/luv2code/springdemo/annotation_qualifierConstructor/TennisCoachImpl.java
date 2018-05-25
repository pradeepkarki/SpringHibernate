package com.luv2code.springdemo.annotation_qualifierConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")

@Component
public class TennisCoachImpl implements ICoach {

	// field injection
	// @Autowired
	// @Qualifier("randomFortuneServiceImpl")
	private IFortuneService fortuneService;

	@Value("${foo.email}")
	private String emailAddress;

	@Value("${foo.team}")
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	// Default constructor
	public TennisCoachImpl() {
		System.out.println(">> inside default constructor");
	}

	// Constructor injection using
	@Autowired
	public TennisCoachImpl(@Qualifier("randomFortuneServiceImpl") IFortuneService fortuneService) {
		super();
		System.out.println("TennisCoachImpl: inside constructor using autowired and qualifier");
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
	public void disp()
	{
		
	}

}
