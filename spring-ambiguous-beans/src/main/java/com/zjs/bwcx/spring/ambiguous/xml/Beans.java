package com.zjs.bwcx.spring.ambiguous.xml;

import org.springframework.beans.factory.annotation.Autowired;


public class Beans {
	
	private Dssert dssert;
	
	@Autowired
	public Beans(Dssert dssert) {
		this.dssert = dssert;
	}
	public Dssert getDssert() {
		return dssert;
	}
}
