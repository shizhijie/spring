package com.zjs.bwcx.spring.spittr.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.zjs.bwcx.spring.spittr.web","com.zjs.bwcx.spring.spittr.config"}) //启用组件扫描
public class WebConfig extends /*WebMvcConfigurerAdapter过时5.0*/ WebMvcConfigurationSupport{
	
	/**
	 * 配置jsp视图解析器
	 */
	/*@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
		return resolver;
	}*/
	
	/**
	 * 配置静态资源的处理
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		//messageSource.setBasename("classpath:messages");
		//messageSource.setDefaultEncoding("utf-8");
		messageSource.setBasenames("classpath:ValidationMessages","classpath:messages_es","classpath:messages");
		return messageSource;
	}
}
