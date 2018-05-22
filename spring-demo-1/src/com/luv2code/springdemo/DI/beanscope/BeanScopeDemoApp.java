package com.luv2code.springdemo.DI.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve the bean from spring container
		ICoach theCoach = context.getBean("baseBallCoach", ICoach.class);

		ICoach alphaCoach = context.getBean("baseBallCoach", ICoach.class);

		boolean isSameObject = (theCoach == alphaCoach);
		System.out.println("Is same object refrence - " + isSameObject);

		System.out.println("Memory location of theCoach - " + theCoach);
		System.out.println("Memory location of alphaCoach - " + alphaCoach);

		// close the context
		context.close();
	}

}
