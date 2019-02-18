package com.zjs.bwcx.spring.ambiguous.custom.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Beans {
	
	private Dssert dssert;
	
	@Autowired
	//@Qualifier("cold")
	//@Qualifier("cake")
	//@Qualifier("cookies")
	//@Qualifier("shizhijie") 用在javaconfig的方法之上的限定符
	@Cold
	//@Creamy
	@Fruity
	public void setDssert(Dssert dssert) {
		this.dssert = dssert;
	}

	public Dssert getDssert() {
		return dssert;
	}
}
