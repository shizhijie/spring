package com.zjs.bwcx.spring.runtime.injection.attributeplaceholder.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:app.properties")
public class ExperssiveConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Value("${disc.title}")
	private String title;
	@Value("${disc.artist}")
	private String artist;

	@Bean
	public BlankDisc blankDisc() {
		return new BlankDisc(title, artist);
	}
}
