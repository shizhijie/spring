package com.zjs.bwcx.spring.aop.addmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //启用AspectJ自动代理
@ComponentScan
public class ConcertConfig {
	
	@Bean
	public EncorableIntroducer encorableIntroducer() {//创建切面对象
		return new EncorableIntroducer();
	}
	
	@Bean("singer")
	public Performance singer() {
		return new Singer();
	}
	
}
