package com.zjs.bwcx.spring.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zjs.bwcx.spring.spittr.exception.DuplicateSpittleException;

@Controller //声明一个控制器
public class HomeController {
	
	/*@RequestMapping(value="/",method=RequestMethod.GET)*/
	@RequestMapping(value= {"/","/homepage"},method=RequestMethod.GET)
	public String home() {
		throw new DuplicateSpittleException();
		//return "home";
	}
}
