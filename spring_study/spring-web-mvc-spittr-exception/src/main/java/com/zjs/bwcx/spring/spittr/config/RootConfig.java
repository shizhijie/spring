package com.zjs.bwcx.spring.spittr.config;

import java.util.regex.Pattern;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = { "com.zjs.bwcx.spring.spittr" }, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfig {
	public static class WebPackage extends RegexPatternTypeFilter {
	    public WebPackage() {
	      super(Pattern.compile("com.zjs.bwcx.spring.spittr\\.web"));
	    }    
	  }
}
