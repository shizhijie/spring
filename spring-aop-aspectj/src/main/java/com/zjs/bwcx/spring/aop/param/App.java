package com.zjs.bwcx.spring.aop.param;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TrackerCounterConfig.class);
		CompactDisc bean = (CompactDisc) applicationContext.getBean("sgtPeppers");
		bean.play();
	}
}
