package com.luv2code.springdemo.annotation_propertysource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class JavaConfig {

	// define bean for SadFortuneService
	@Bean
	// We can give any method name beacuse the method is the one gets register as
	// bean name as default
	public IFortuneService sadFortuneService() {
		return new SadFortuneServiceImpl();
	}

	// define bean for swimcoach and inject dependencies
	@Bean
	public ICoach swimCoach() {
		return new SwimCoachImpl(sadFortuneService());
	}
	
	@Bean
	public IFortuneService happyFortuneService()
	{
		return new HappyFortuneServiceImpl();
	}
	
	@Bean
	public ICoach footballCoach()
	{
		return new FootballcoachImpl(happyFortuneService());
	}
}
