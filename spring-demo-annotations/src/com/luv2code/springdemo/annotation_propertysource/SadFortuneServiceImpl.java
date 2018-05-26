/**
 * 
 */
package com.luv2code.springdemo.annotation_propertysource;

import org.springframework.stereotype.Component;

/**
 * @author darkprince
 *
 */
@Component
public class SadFortuneServiceImpl implements IFortuneService {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.annotation_bean.IFortneService#getDailyFortune()
	 */
	@Override
	public String getDailyFortune() {
		return "Today is your lucky day";
	}

}
