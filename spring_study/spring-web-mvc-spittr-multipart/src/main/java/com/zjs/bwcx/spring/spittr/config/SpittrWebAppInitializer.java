package com.zjs.bwcx.spring.spittr.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		//将DispatcherServlet映射到 "/"
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {//C:\Users\admin\Pictures\Camera Roll
		registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads", 2097152 ,4194304, 0));
	}
}
