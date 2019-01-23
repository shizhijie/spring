package com.zjs.bwcx.spring.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.zjs.bwcx.spring.spittr.web","com.zjs.bwcx.spring.spittr.config"}) // 启用组件扫描
public class WebConfig extends /* WebMvcConfigurerAdapter过时5.0 */ WebMvcConfigurationSupport {

	/*@Bean
	public TemplateResolver templateReslover() {// 模板解析器
		TemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/views");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		return templateResolver;
	}

	@Bean
	public TemplateEngine templateEngine(TemplateResolver templateReslover) {// 模板引擎
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateReslover);
		return templateEngine;
	}

	// Thymeleaf视图解析器
	@Bean
	public ViewResolver viewResolver(SpringTemplateEngine springTemplateEngine) {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(springTemplateEngine);
		return viewResolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}*/
}
