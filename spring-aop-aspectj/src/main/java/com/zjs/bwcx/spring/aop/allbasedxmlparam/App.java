package com.zjs.bwcx.spring.aop.allbasedxmlparam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aspectj-allbasedxml-param.xml");
		CompactDisc bean = (CompactDisc) applicationContext.getBean("cd");
		bean.play();
	}
}
