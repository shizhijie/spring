package com.zjs.bwcx.spring.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

@Configuration
@ImportResource("classpath:servlet-context.xml")
public class ThymeleafConfig {

	@Bean
	public ViewResolver viewResolver(org.thymeleaf.spring4.SpringTemplateEngine templateEngine) {
		org.thymeleaf.spring4.view.ThymeleafViewResolver viewResolver = new org.thymeleaf.spring4.view.ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine);
		viewResolver.setCharacterEncoding("UTF-8");
		viewResolver.setOrder(1);
		return viewResolver;
	}

	@Bean
	public org.thymeleaf.spring4.SpringTemplateEngine templateEngine(TemplateResolver templateResolver) {
		org.thymeleaf.spring4.SpringTemplateEngine templateEngine = new org.thymeleaf.spring4.SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver);
		return templateEngine;
	}

	@Bean
	public TemplateResolver templateResolver() {
		TemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/views/");
		templateResolver.setSuffix(".html");
		templateResolver.setCharacterEncoding("UTF-8");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setCacheable(true);
		return templateResolver;
	}
}
