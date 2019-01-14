package com.zjs.bwcx.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean(name= {"lonelyHeartsClub"})
	public CompactDisc sgtPerppers() {
		return new SgtPeppers();
	}
	
}
