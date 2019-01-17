package com.zjs.bwcx.aspectj.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aspectj.xml");
		Performance bean = (Performance) applicationContext.getBean("singer");
		bean.perform();
	}
	
}
