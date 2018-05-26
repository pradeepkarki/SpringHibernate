package com.luv2code.springdemo.annotation_beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportApp {

	public static void main(String[] args) {

		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-scope-applicationContext.xml");

		// get the bean from the container
		ICoach theCoach = context.getBean("tennisCoachImpl", ICoach.class);
		
		ICoach alphaCoach = context.getBean("tennisCoachImpl", ICoach.class);
		
		boolean result = (theCoach==alphaCoach);

		// call a method on the bean
		System.out.println("Is both bean equals-"+result);

		System.out.println("Memory location for theCoach -"+theCoach);
		
		System.out.println("Memory location for aplhaCoach -"+alphaCoach);

	}

}
