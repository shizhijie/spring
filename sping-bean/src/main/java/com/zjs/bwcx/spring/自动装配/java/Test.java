package com.zjs.bwcx.spring.自动装配.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(JavaConfig.class);
		CDPlayer bean = app.getBean(CDPlayer.class);
		bean.play();
	}
	
}
