package com.luv2code.springdemo.annotation_qualifier;

import org.springframework.stereotype.Component;

@Component
public class RestFortneServiceImpl implements IFortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Rest fortune service";
	}

}
