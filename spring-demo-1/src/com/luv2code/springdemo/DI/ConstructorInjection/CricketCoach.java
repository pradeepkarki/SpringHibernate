package com.luv2code.springdemo.DI.ConstructorInjection;

public class CricketCoach implements ICoach {

	//Define a private feield for dependency
	private IFortuneService fortuneService;
	
	//Inject using constructor
	public CricketCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		String fortune = fortuneService.getFortune();
		return fortune;
	}

}
