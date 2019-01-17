package com.zjs.bwcx.spring.aop.addmethodbyxml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-aspectj-addmethodbyxml2.xml"})
public class TestApp2 {
	
	@Autowired
	private Performance performance;
	
	@Test
	public void start() {
		performance.perform();
		Encorable encorable = (Encorable) performance;
		encorable.performEncore();
	}
	
}
