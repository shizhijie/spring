package com.zjs.bwcx.spring.aop.allbasedxmlpointcutextract;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aspectj-allbasedxml-pointcutextract.xml");
		Performance bean = (Performance) applicationContext.getBean("singer");
		bean.perform();
	}
	
}
