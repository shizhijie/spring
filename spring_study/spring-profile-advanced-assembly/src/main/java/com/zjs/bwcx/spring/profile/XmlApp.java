package com.zjs.bwcx.spring.profile;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApp {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.setProperty("spring.profiles.default", "dev");
		System.setProperty("spring.profiles.active", "prod");
		System.setProperty("spring.profiles.active", "qa");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-beans-profile-config.xml");
		DataSource dataSource= (DataSource) applicationContext.getBean("dataSource");
		System.out.println(dataSource);
	}
	
}
