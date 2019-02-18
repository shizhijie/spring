package com.zjs.bwcx.spring.aop.concert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConcertConfig.class);
		Performance bean = (Performance) applicationContext.getBean("singer");
		bean.perform();
	}
	
}
