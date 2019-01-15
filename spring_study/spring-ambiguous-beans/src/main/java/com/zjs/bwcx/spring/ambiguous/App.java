package com.zjs.bwcx.spring.ambiguous;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Beans bean = (Beans) applicationContext.getBean("beans");
		System.out.println(bean);
	}
	
}
