package com.zjs.bwcx.spring.javaconfig;

public class CDPlayer implements MediaPlayer{
	 
	private CompactDisc compactDisc;
	
	public CDPlayer(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	public void play() {
		compactDisc.play();
	}
	
	
}
