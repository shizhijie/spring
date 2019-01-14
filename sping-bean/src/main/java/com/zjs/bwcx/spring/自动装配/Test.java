package com.zjs.bwcx.spring.自动装配;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		CDPlayer bean = applicationContext.getBean(CDPlayer.class);
		bean.play();
	}
	
}
