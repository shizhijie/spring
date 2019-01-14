package com.zjs.bwcx.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/zjs/bwcx/spring/xml/spring-beans.xml");
		CDPlayer bean = (CDPlayer) applicationContext.getBean("cdPlayer");
		bean.play();
	}
	
}
