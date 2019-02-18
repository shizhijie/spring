package com.zjs.bwcx.spring.runtime.injection.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class ExperssiveConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public BlankDisc blankDisc() {
		//return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
		//return new BlankDisc(env.getProperty("disc.title", "songbie"), env.getProperty("disc.artist","shizhijie"));
		return new BlankDisc(env.getRequiredProperty("disc.title"), env.getRequiredProperty("disc.artist"));
	}

}
