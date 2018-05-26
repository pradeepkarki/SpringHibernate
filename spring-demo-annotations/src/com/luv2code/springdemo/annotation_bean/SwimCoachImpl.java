/**
 * 
 */
package com.luv2code.springdemo.annotation_bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author darkprince
 *
 */
@Component
public class SwimCoachImpl implements ICoach {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.annotation_bean.ICoach#getDailyWorkOt()
	 */
	
	private IFortneService fortuneService;
	
	@Value("${foo.email}")
	private String emailAddress;
	
	@Value("${foo.team}")
	private String team;
	
	
	//Constructor injection
	public SwimCoachImpl(IFortneService fortuneService1) {
		this.fortuneService = fortuneService1;
	} 
	@Override
	public String getDailyWorkOt() {
		return "Swim Daily 12 length";
	}

	@Override
	public String getDailyFortne() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune() ;
	}

}
