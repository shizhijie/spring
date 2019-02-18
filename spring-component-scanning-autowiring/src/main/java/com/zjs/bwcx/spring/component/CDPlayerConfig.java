package com.zjs.bwcx.spring.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan(basePackages= {"com.zjs.bwcx.spring.component"})*/
@ComponentScan(basePackageClasses= {CompactDisc.class})
public class CDPlayerConfig {
}
