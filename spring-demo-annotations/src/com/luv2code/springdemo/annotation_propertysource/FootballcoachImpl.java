package com.luv2code.springdemo.annotation_propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballcoachImpl implements ICoach {

	private IFortuneService fortunService;
	
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
	//constructor injection
	public FootballcoachImpl(IFortuneService fortuneService)
	{
		this.fortunService=fortuneService;
	}
	@Override
	public String getDailyWorkOt() {
		// TODO Auto-generated method stub
		return "Do daily workout";
	}

	@Override
	public String getDailyFortne() {
		// TODO Auto-generated method stub
		return fortunService.getDailyFortune();
	}

	@Override
	public String getCoachDetails() {
		// TODO Auto-generated method stub
		return getEmailAddress() +"  "+getTeam();
	}

}
