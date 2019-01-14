package com.zjs.bwcx.spring.xml;

public class CDPlayer implements MediaPlayer{
	 
	private CompactDisc compactDisc;
	
	/*public CDPlayer(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}*/
	
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}



	public void play() {
		compactDisc.play();
	}
	
	
}
