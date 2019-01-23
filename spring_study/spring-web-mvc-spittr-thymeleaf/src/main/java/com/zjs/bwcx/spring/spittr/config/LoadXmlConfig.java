package com.zjs.bwcx.spring.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@ImportResource("classpath:servlet-context.xml")
public class LoadXmlConfig {

}
