package com.zjs.bwcx.spring.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@ImportResource(locations= {"classpath:servlet-context.xml"})
public class TilesConfiguration {
	
	@Bean
	public TilesConfigurer tilesConfig() {
		TilesConfigurer tiles = new TilesConfigurer();
		tiles.setDefinitions(new String[] {
				"/WEB-INF/layout/tiles.xml",
				"/WEB-INF/**/tiles.xml"
		});//指定tiles 定义的位置   "/WEB/INF/**/tiles.xml"
		tiles.setCheckRefresh(true);//启用刷新功能
		return tiles;
	}
	
	@Bean
	public ViewResolver viewResolver() {
		return new TilesViewResolver();
	}
	
}
