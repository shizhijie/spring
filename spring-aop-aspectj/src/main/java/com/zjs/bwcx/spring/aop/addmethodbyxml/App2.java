package com.zjs.bwcx.spring.aop.addmethodbyxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aspectj-addmethodbyxml2.xml");
		Performance bean = (Performance) applicationContext.getBean("singer");
		bean.perform();
		Encorable encorable = (Encorable) bean;
		encorable.performEncore();
	}
	
}
