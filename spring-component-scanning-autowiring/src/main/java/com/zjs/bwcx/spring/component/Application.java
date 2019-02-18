package com.zjs.bwcx.spring.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		/*CompactDisc compactDisc = (CompactDisc) applicationContext.getBean("sgtPeppers");*/
		/*CompactDisc compactDisc = (CompactDisc) applicationContext.getBean("lonelyHeartsClub");*/
		CompactDisc compactDisc = applicationContext.getBean(CompactDisc.class);
		compactDisc.play();
	}
	
}
