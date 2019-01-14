package com.zjs.bwcx.spring.xml.literalvalue.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjs.bwcx.spring.xml.CompactDisc;

public class AppSpringUtil {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-beans-spring-util.xml");
		CompactDisc bean = (CompactDisc) applicationContext.getBean("compactDisc");
		bean.play();
	}
	
}
