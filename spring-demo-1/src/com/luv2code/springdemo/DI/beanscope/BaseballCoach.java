/**
 * 
 */
package com.luv2code.springdemo.DI.beanscope;

/**
 * @author darkprince
 *
 */
public class BaseballCoach implements ICoach {

	// define a private Field for dependency
	private IFortuneService fortuneService;

	// email and team name field
	private String emailAddress;
	private String team;

	public void setEmailAddress(String emailAddress) {
		System.out.println("BaseballCoach : inside setter method- setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("BaseballCoach : inside setter method- setTeam");
		this.team = team;
	}

	// define a constructor for dependency injection\
	public BaseballCoach() {
		System.out.println("BaseBallcoach : inside no-arg constructor");
	}

	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("BaseBallcoach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "spend 30 minutes on batting parctice";

	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyFortune() {
		String fortune = fortuneService.getFortune();
		return fortune;
	}


}
