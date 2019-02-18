package com.zjs.bwcx.spring.spittr.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.zjs.bwcx.spring.spittr.web") //启用组件扫描
public class WebConfig extends /*WebMvcConfigurerAdapter过时5.0*/ WebMvcConfigurationSupport{
	
	/**
	 * 配置jsp视图解析器
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
		return resolver;
	}
	
	/**
	 * 配置静态资源的处理
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	/**
	 * 
	 * java  config
	 * 如果想让InternalResourceViewResolver将试图解析为JstlView,而不是
	 * InternalResourceView的话，那么我们只需要设置他的viewClass属性即可
	 * resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
	 * 
	 * xml config
	 *	<bean id="viewResolver"
	 *	    class="org.springframework.web.servlet.view.InternalResourceViewResolver"
	 *	    p:prefix="/WEB-INF/views/" 
	 *	    p:suffix=".jsp" 
	 *      p:viewClass="org.springframework.web.servlet.view.JstlView"/>
	 * 
	 */

	//加载属性文件
	/*@Override
	protected Validator getValidator() {
		return super.getValidator();
	}*/
	
	/*@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		messageSource.setDefaultEncoding("utf-8");
		messageSource.setBasename("classpath:ValidationMessages.properties");
		return messageSource;
	}*/
	//配置校验错误信息配置
	@Bean
	public Validator validator() {
		LocalValidatorFactoryBean validator=new LocalValidatorFactoryBean();
		validator.setValidationMessageSource(messageSource());
		return validator;
	}
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		//messageSource.setBasename("classpath:messages");
		//messageSource.setDefaultEncoding("utf-8");
		messageSource.setBasenames("classpath:ValidationMessages","classpath:messages_es","classpath:messages");
		return messageSource;
	}
	
	/*@Bean //报错
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setCacheSeconds(10);
		return messageSource();
	}*/
	
	
}
