package com.zjs.bwcx.spring.runtime.injection.env;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ExperssiveConfig.class)
public class AppTest {
	
	@Autowired
	CompactDisc cd;
	
	@Test
	public void testDisc() {
		cd.play();
	}
	
}
