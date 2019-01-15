package com.zjs.bwcx.spring.ambiguous.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.zjs.bwcx.spring.ambiguous.javaconfig.Dssert;

@Component
public class Beans {
	
	@SuppressWarnings("unused")
	private Dssert dssert;
	
	@Autowired
	//@Qualifier("iceCream")
	//@Qualifier("cake")
	@Qualifier("cookies")
	public void setDssert(Dssert dssert) {
		this.dssert = dssert;
	}
	public Dssert getDssert() {
		return dssert;
	}
}
