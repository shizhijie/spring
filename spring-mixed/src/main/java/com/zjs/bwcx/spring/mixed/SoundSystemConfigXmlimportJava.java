package com.zjs.bwcx.spring.mixed;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@Import({CDConfig.class,CDPlayerConfig.class})
@ImportResource(locations= {/*"classpath:spring-beans-c.xml"*/"spring-beans-cd.xml"})
public class SoundSystemConfigXmlimportJava {
}
