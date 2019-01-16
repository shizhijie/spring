package com.zjs.bwcx.spring.aop.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
	
	@Before("execution(** com.zjs.bwcx.spring.aop.concert.Performance.perform(..))")
	public void silenceCellPhones() {//表演之前 手机静音
		System.out.println("Silencing cell phones");
	}
	
	@Before("execution(** com.zjs.bwcx.spring.aop.concert.Performance.perform(..))")
	public void taskSeats() {
		System.out.println("Tasking seats");
	}
	
	@AfterReturning("execution(** com.zjs.bwcx.spring.aop.concert.Performance.perform(..))")
	public void applause() {//表演成功 喝彩鼓掌
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("execution(** com.zjs.bwcx.spring.aop.concert.Performance.perform(..))")
	public void demandRefund() {// 表演失败之后 要求退款
		System.out.println("Demanding a refund");
	}
	
}
