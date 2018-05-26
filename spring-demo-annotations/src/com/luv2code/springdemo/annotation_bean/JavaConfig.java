package com.luv2code.springdemo.annotation_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	// define bean for SadFortuneService
	@Bean
	// We can give any method name beacuse the method is the one gets register as
	// bean name as default
	public IFortneService sadFortuneService() {
		return new SadFortuneServiceImpl();
	}

	// define bean for swimcoach and inject dependencies
	@Bean
	public ICoach swimCoach() {
		return new SwimCoachImpl(sadFortuneService());
	}

}
