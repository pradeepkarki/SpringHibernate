package com.luv2code.springdemo.IOC;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		
		//Coach theCoach = new BaseballCoach();
		Coach theCoach = new FootballCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkOut());
		
	}

}
