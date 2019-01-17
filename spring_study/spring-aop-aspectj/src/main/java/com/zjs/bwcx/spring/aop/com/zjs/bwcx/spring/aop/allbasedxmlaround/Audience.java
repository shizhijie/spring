package com.zjs.bwcx.spring.aop.com.zjs.bwcx.spring.aop.allbasedxmlaround;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	public void performance() {}
	
	public void watchPerformance(ProceedingJoinPoint jPoint) {
		
		try {
			System.out.println("关掉手机");
			System.out.println("找到座位");
			jPoint.proceed();
			System.out.println("好好好！！鼓掌");
		} catch (Throwable e) {
			System.out.println("退票！ 退票！ ");
		}
		
	}
	
}
