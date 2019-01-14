package com.zjs.bwcx.spring.bean;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class,ComponentConfig.class);
		CDPlayer bean = applicationContext.getBean(CDPlayer.class);
		bean.play();
	}
	
}
