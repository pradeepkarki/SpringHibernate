/**
 * 
 */
package com.luv2code.springdemo.annotation_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author darkprince
 *
 */
public class JavaBeanAnnoationApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// read teh spring config java file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// get the bean from the container
		ICoach theCoach = context.getBean("swimCoach", ICoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkOt());

		System.out.println(theCoach.getDailyFortne());

	}

}
