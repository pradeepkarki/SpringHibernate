package com.luv2code.springdemo.annotation_beanlifecycle;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceImpl implements IFortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
