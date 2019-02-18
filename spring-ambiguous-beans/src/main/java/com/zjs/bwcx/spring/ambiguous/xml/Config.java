package com.zjs.bwcx.spring.ambiguous.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource(locations= {"classpath:spring-beans.xml"})
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
}
