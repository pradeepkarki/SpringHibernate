package com.luv2code.springdemo.annotation_qualifier;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneServiceImpl implements IFortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Database fortune Service";
	}

}
