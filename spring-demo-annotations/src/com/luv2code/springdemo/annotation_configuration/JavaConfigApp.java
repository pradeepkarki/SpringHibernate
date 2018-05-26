package com.luv2code.springdemo.annotation_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
No xml is required because we can se java class to conf the application
using the @configuration and @ComponentScan("com.luv2code.springdemo.annotation_configuration")
*/

public class JavaConfigApp {

	public static void main(String[] args) {

		// read spring java config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the container
		ICoach theCoach = context.getBean("tennisCoachImpl", ICoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

	}

}
