package com.zjs.bwcx.spring.aop.addmethodbyxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aspectj-addmethodbyxml.xml");
		Performance bean = (Performance) applicationContext.getBean("singer");
		bean.perform();
		Encorable encorable = (Encorable) bean;
		encorable.performEncore();
	}
	
}
