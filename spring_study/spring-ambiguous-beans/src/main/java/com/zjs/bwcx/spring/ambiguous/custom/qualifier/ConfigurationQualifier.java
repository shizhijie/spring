package com.zjs.bwcx.spring.ambiguous.custom.qualifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import({Config.class})
public interface ConfigurationQualifier {
}
