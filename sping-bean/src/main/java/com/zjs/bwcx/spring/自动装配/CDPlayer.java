package com.zjs.bwcx.spring.自动装配;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
	
	private CompactDisc cd;
	
	
	/*@Autowired(required=false)
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}*/
	
	/*@Autowired(required=false)
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}*/
	
	@Autowired(required=false)
	public void setewqewqCompactDisc12e2e(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

}
