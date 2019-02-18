package com.zjs.bwcx.spring.scope.singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope( value=ConfigurableBeanFactory.SCOPE_SINGLETON)  //默认的类型
public class Notepad {

}
