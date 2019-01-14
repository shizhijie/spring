package com.zjs.bwcx.spring.组件扫描;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zjs.bwcx.spring.组件扫描.CDPlayerConfig;
import com.zjs.bwcx.spring.组件扫描.CompactDisc;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		/*CompactDisc bean = applicationContext.getBean(CompactDisc.class);*/
		CompactDisc bean = (CompactDisc) applicationContext.getBean("lonelyHeartsClub");
		bean.play();
	}
	
}
