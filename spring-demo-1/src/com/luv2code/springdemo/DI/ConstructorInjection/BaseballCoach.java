/**
 * 
 */
package com.luv2code.springdemo.DI.ConstructorInjection;

/**
 * @author darkprince
 *
 */
public class BaseballCoach implements ICoach {

	// define a private field for dependency
	private IFortuneService fortuneService;
	// define a constructor for dependency injection

	public BaseballCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "spend 30 minutes on batting parctice";

	}

	@Override
	public String getDailyFortune() {
		String fortune=fortuneService.getFortune();
		return fortune;
	}

}
