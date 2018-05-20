/**
 * 
 */
package com.luv2code.springdemo.DI.InjectingLiterals;

/**
 * @author darkprince
 *
 */
public class BaseballCoach implements ICoach {

	// define a private Field for dependency
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

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
