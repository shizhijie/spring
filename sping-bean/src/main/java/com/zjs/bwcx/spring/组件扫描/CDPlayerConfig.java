package com.zjs.bwcx.spring.组件扫描;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan(basePackages= {"com.zjs.bwcx.spring.自动装配.service"})*/
@ComponentScan(basePackageClasses= {CompactDisc.class})
public class CDPlayerConfig {
}
