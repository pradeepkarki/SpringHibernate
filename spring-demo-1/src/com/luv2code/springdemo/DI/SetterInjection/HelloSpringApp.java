package com.luv2code.springdemo.DI.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		ICoach theCoach = context.getBean("myCricketCoach", ICoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());

		// call fortune method
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
