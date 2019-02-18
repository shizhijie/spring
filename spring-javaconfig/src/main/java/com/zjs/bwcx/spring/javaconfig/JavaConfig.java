package com.zjs.bwcx.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean("cd")
	public CompactDisc sgtPerppers() {
		return new SgtPeppers();
	}
	
	@Bean("lonelyHeatsClub")
	public MediaPlayer cdPlayer() {
		return new CDPlayer(sgtPerppers());
	}
	
}
