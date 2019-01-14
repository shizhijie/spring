package com.zjs.bwcx.spring.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan(basePackageClasses= {CDPlayer.class,SgtPeppers.class})*/
/*@ComponentScan(basePackageClasses= {MediaPlayer.class})*/
//@ComponentScan(basePackages= {"com.zjs.bwcx.spring.component"})//错误
@ComponentScan(basePackages= {"com.zjs.bwcx.spring.autowired"})
public interface Configure {
}
