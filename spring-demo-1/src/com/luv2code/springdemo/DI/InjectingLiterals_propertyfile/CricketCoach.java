package com.luv2code.springdemo.DI.InjectingLiterals_propertyfile;

public class CricketCoach implements ICoach {

	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	// Define a private field for dependency
	private IFortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		return "practice fast bowling";
	}

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		String fortune = fortuneService.getFortune();
		return fortune;
	}

	@Override
	public String getDetails() {
		
		return emailAddress+" "+team;
	}

}
