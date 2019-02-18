package com.zjs.bwcx.spring.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
		CDPlayer bean = applicationContext.getBean(CDPlayer.class);
		bean.play();
	}
}
