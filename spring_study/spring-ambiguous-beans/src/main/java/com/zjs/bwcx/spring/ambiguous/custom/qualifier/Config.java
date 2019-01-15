package com.zjs.bwcx.spring.ambiguous.custom.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
	
	/*@Bean
	public Beans beans(Dssert dssert) {
		return new Beans(dssert);
	}*/
	
	@Bean
	public Cake cake() {
		return new Cake();
	}
	
	@Bean
	public Cookies cookies() {
		return new Cookies();
	}
	
	@Bean 
	@Qualifier
	public IceCream iceCream() {
		return new IceCream();
	}
	
}
