package com.zjs.bwcx.spring.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.zjs.bwcx.spring.spittr.web") //启用组件扫描
public class WebConfig extends /*WebMvcConfigurerAdapter过时5.0*/ WebMvcConfigurationSupport{
	
	@Bean
	public TemplateResolver templateReslover() {//模板解析器
		TemplateResolver templateResolver = new TemplateResolver();
		templateResolver.setPrefix("/WEB-INF/templates");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		return templateResolver;
	}
	
	@Bean
	public TemplateEngine templateEngine(TemplateResolver templateReslover) {//模板引擎
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateReslover);
		return templateEngine;
	}
	
	//Thymeleaf视图解析器
	@Bean
	public ViewResolver viewResolver(SpringTemplateEngine springTemplateEngine) {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(springTemplateEngine);
		return viewResolver;
	}
}
