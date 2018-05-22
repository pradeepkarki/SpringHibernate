package com.luv2code.springdemo.DI.beanscope_lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// retrieve the bean from spring container
		ICoach theCoach = context.getBean("myCricketCoach", ICoach.class);

		System.out.println(theCoach.getDailyWorkOut());

		// close the context
		context.close();
	}

}
