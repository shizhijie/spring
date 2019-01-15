package com.zjs.bwcx.spring.ambiguous.xml;

import org.springframework.beans.factory.annotation.Autowired;

public class Beans {
	
	@SuppressWarnings("unused")
	private Dssert dssert;
	
	@Autowired
	public Beans(Dssert dssert) {
		this.dssert = dssert;
	}
	
}
