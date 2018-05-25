package com.luv2code.springdemo.annotation_qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportApp {

	public static void main(String[] args) {

		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"qualifierapplicationContext.xml");

		// get the bean from the container
		ICoach theCoach = context.getBean("tennisCoachImpl", ICoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

	}

}
