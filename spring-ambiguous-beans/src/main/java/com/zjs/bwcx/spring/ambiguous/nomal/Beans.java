package com.zjs.bwcx.spring.ambiguous.nomal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
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
