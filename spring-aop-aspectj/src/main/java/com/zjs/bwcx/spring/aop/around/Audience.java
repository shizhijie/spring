package com.zjs.bwcx.spring.aop.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(* com.zjs.bwcx.spring.aop.around.Performance.perform(..))")
	public void performance() {}
	
	@Around("performance()")
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
