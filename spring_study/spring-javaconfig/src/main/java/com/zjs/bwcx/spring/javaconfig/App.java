package com.zjs.bwcx.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		/*CDPlayer bean = (CDPlayer) applicationContext.getBean("cdPlayer");*/
		/*CDPlayer bean = applicationContext.getBean(CDPlayer.class);*/
		/*CompactDisc bean = (CompactDisc) applicationContext.getBean("sgtPerppers");*/
		/*CompactDisc bean = applicationContext.getBean(CompactDisc.class);*/
		/*CDPlayer bean = (CDPlayer) applicationContext.getBean("lonelyHeatsClub");*/
		CompactDisc bean = (CompactDisc) applicationContext.getBean("cd");
		bean.play();
	}
	
}
