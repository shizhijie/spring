package com.zjs.bwcx.spring.ambiguous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Beans {
	
	@SuppressWarnings("unused")
	private Dssert dssert;
	
	@Autowired
	public Beans(Dssert dssert) {
		this.dssert = dssert;
	}
	
}
