package com.zjs.bwcx.spring.ambiguous.custom.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
	
	
	@Bean
	public Cake cake() {
		return new Cake();
	}
	
	@Bean
	@Qualifier("shizhijie")
	public Cookies cookies() {
		return new Cookies();
	}
	
}
