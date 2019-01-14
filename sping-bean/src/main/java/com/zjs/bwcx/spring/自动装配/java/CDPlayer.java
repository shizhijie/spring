package com.zjs.bwcx.spring.自动装配.java;

public class CDPlayer implements MediaPlayer{
	
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}

}
