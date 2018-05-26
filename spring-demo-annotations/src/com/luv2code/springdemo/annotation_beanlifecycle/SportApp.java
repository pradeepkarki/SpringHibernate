package com.luv2code.springdemo.annotation_beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportApp {

	public static void main(String[] args) {

		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-lifecycle-applicationContext.xml");

		// get the bean from the container
		ICoach theCoach = context.getBean("tennisCoachImpl", ICoach.class);
		
		//bean methods
		System.out.println(theCoach.getDailyFortune());

	}

}
