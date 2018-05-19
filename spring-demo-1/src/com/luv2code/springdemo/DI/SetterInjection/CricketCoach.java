package com.luv2code.springdemo.DI.SetterInjection;

public class CricketCoach implements ICoach {

	// Define a private field for dependency
	private IFortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		return "practice fast bowling";
	}

	public CricketCoach() {

	}
	// Inject using setter

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		String fortune = fortuneService.getFortune();
		return fortune;
	}

}
