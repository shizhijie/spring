package com.zjs.bwcx.spring.aop.addmethod;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncorableIntroducer {
	
	@DeclareParents(value="com.zjs.bwcx.spring.aop.addmethod.Performance+",
					defaultImpl=DefaultEncorableImpl.class)
	public static Encorable encorable;
}
