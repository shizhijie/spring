package com.zjs.bwcx.spring.aop.param.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aspectj-param.xml");
		CompactDisc bean = (CompactDisc) applicationContext.getBean("sgtPeppers");
		bean.play();
	}
}
