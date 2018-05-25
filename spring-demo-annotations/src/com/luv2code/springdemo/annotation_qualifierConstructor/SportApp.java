package com.luv2code.springdemo.annotation_qualifierConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Autowired and qualifier annotation and properties file example*/

public class SportApp {

	public static void main(String[] args) {

		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"qualifierconstructorapplicationContext.xml");

		// get the bean from the container
		//ICoach theCoach = context.getBean("tennisCoachImpl", ICoach.class);
		TennisCoachImpl tennisCoach = context.getBean("tennisCoachImpl",TennisCoachImpl.class);

		// call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());

		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(tennisCoach.getEmailAddress()+"    "+tennisCoach.getTeam());
		

	}

}
