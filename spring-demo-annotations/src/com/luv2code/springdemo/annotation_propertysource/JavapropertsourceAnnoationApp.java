/**
 * 
 */
package com.luv2code.springdemo.annotation_propertysource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author darkprince
 *
 */
public class JavapropertsourceAnnoationApp {

	/**
	 * @param args
	 * This package explain the use of properties file using
	 * @propertySource 
	 * @bean
	 * if we use @bean we dont have to use @Autowired we can define a method to do DI
	 * @component
	 * @
	 */
	public static void main(String[] args) {
		// read teh spring config java file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// get the bean from the container
		//ICoach theCoach = context.getBean("swimCoach", ICoach.class);

		ICoach theCoach = context.getBean("footballCoach", ICoach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkOt());

		System.out.println(theCoach.getDailyFortne());
		
		System.out.println(theCoach.getCoachDetails());

	}

}
