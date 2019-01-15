package com.zjs.bwcx.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.setProperty("magic", "");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigBean.class);
		MagicBean bean = applicationContext.getBean(MagicBean.class);
		System.out.println(bean);
		
	}
	
}
