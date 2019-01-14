package com.zjs.bwcx.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
		/*CDPlayer bean = (CDPlayer) applicationContext.getBean("cdpy");*/
		CDPlayer bean = applicationContext.getBean(CDPlayer.class);
		bean.play();
	}
	
}
