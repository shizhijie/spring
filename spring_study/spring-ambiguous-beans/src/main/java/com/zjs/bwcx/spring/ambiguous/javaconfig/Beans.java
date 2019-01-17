package com.zjs.bwcx.spring.ambiguous.javaconfig;

public class Beans {
	
	private Dssert dssert;
	
	public Beans(Dssert dssert) {
		this.dssert = dssert;
	}

	public Dssert getDssert() {
		return dssert;
	}
	
}
