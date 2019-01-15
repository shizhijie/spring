package com.zjs.bwcx.spring.profile;


import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApp {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.setProperty("spring.profiles.default", "dev");
		
		System.setProperty("spring.profiles.active", "prod");
		
		System.setProperty("spring.profiles.active", "QA");
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataSourceConfig.class);
		//DataSource embeddedDataSource = (DataSource) applicationContext.getBean("embeddedDataSource");
		//System.out.println(embeddedDataSource==null);
		//DataSource jndiDataSource = (DataSource) applicationContext.getBean("jndiDataSource");
		//System.out.println(jndiDataSource);
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		System.out.println(dataSource);
	}
	
}
