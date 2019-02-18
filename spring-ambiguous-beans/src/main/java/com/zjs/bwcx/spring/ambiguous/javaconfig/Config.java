package com.zjs.bwcx.spring.ambiguous.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class Config {
	
	@Bean
	public Beans beans(Dssert dssert) {
		return new Beans(dssert);
	}
	
	@Bean
	public Cake cake() {
		return new Cake();
	}
	
	@Bean
	public Cookies cookies() {
		return new Cookies();
	}
	
	@Bean 
	@Primary
	public IceCream iceCream() {
		return new IceCream();
	}
	
}
