package com.zjs.bwcx.spring.runtime.injection.attributeplaceholder.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:com/zjs/bwcx/spring/runtime/injection/attributeplaceholder/xml/spring-beans-c.xml"})
public class AppTest {

	@Autowired
	CompactDisc cd;
	
	@Test
	public void testDisc() {
		cd.play();
	}
	
}
