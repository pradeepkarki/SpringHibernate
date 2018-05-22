package com.luv2code.springdemo.DI.InjectingLiterals;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container using Interface

		/*
		 * ICoach theCoach = context.getBean("myBaseBallCoach", ICoach.class); // call
		 * methods on the bean System.out.println(theCoach.getDailyWorkOut());
		 * 
		 * // call fortune method System.out.println(theCoach.getDailyFortune());
		 * 
		 * // call literls System.out.println(theCoach.getDetails());
		 * 
		 * // call all literals value
		 * 
		 */
		// close the context

		BaseballCoach theCoach = context.getBean("myBaseBallCoach", BaseballCoach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());

		// call fortune method
		System.out.println(theCoach.getDailyFortune());

		// call all literals value

		System.out.println("Email - " + theCoach.getEmailAddress());
		System.out.println("Team - " + theCoach.getTeam());
		context.close();
	}

}
