package com.zjs.bwcx.spring.mixed;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppJavaimportxml {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SoundSystemConfigJavaimportXml.class);
		CDPlayer bean = applicationContext.getBean(CDPlayer.class);
		BlankDisc bean2 = applicationContext.getBean(BlankDisc.class);
		bean2.play();
		bean.play();
	}
	
}
