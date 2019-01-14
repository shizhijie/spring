package com.zjs.bwcx.spring.xml.literalvalue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-beans-literalvalue.xml");
		//BlankDisc bean = (BlankDisc) applicationContext.getBean("com.zjs.bwcx.spring.xml.literalvalue.BlankDisc#0");
		BlankDisc bean = (BlankDisc) applicationContext.getBean("blankDisc");
		bean.play();
	}
	
}
