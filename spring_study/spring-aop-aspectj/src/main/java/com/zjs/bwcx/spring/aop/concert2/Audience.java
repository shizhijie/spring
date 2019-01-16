package com.zjs.bwcx.spring.aop.concert2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** com.zjs.bwcx.spring.aop.concert2.Performance.perform(..))")
	public void performance() {}
	
	@Before("performance()")
	public void silenceCellPhones() {//表演之前 手机静音
		System.out.println("Silencing cell phones");
	}
	
	@Before("performance()")
	public void taskSeats() {
		System.out.println("Tasking seats");
	}
	
	@AfterReturning("performance()")
	public void applause() {//表演成功 喝彩鼓掌
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {// 表演失败之后 要求退款
		System.out.println("Demanding a refund");
	}
	
}
