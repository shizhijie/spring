package com.zjs.bwcx.spring.ambiguous.custom.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationQualifier.class);
		Beans bean = (Beans) applicationContext.getBean("beans");
		System.out.println(bean.getDssert());
	}
	
}
