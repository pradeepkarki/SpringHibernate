package com.luv2code.springdemo.annotation_beanscope;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceImpl implements IFortuneService {

	//create an array of strings
	private String[] data= {
			"never trust any one",
			"learn java every day",
			"Journey is a reward"
			
	};
	
	//create a ramdom number generator
	private Random myrandom = new Random();
	
	@Override
	public String getFortune() {
		int index=myrandom.nextInt(data.length);
		String theRandomFortune=data[index];
		return theRandomFortune;
	}

}
