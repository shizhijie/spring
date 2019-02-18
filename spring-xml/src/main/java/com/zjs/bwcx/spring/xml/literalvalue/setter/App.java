package com.zjs.bwcx.spring.xml.literalvalue.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjs.bwcx.spring.xml.CompactDisc;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-beans-literalvalue-setter.xml");
		/*CompactDisc bean = applicationContext.getBean(CompactDisc.class);*/
		/*CompactDisc bean = applicationContext.getBean(BlankDisc.class);*/
		CompactDisc bean = (CompactDisc) applicationContext.getBean("blankDisc");
		bean.play();
	}
	
}
