package com.luv2code.springdemo.annotation_propertysource;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceImpl implements IFortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "you will be happy today";
	}

}
