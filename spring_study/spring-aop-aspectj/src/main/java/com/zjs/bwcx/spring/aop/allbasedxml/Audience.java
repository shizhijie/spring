package com.zjs.bwcx.spring.aop.allbasedxml;

import org.aspectj.lang.annotation.AfterReturning;

public class Audience {
	
	public void performance() {}
	
	public void silenceCellPhones() {//表演之前 手机静音
		System.out.println("Silencing cell phones");
	}
	
	public void taskSeats() {
		System.out.println("Tasking seats");
	}
	
	@AfterReturning("performance()")
	public void applause() {//表演成功 喝彩鼓掌
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	public void demandRefund() {// 表演失败之后 要求退款
		System.out.println("Demanding a refund");
	}
	
	public void end() {//表演成功 喝彩鼓掌
		System.out.println("i am after");
	}
	
}
