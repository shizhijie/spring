package com.zjs.bwcx.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		/*CompactDisc bean = applicationContext.getBean(CompactDisc.class);*/
		CompactDisc bean = (CompactDisc) applicationContext.getBean("lonelyHeartsClub");
		bean.play();
	}
	
}
