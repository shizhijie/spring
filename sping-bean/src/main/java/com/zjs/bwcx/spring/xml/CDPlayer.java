package com.zjs.bwcx.spring.xml;

public class CDPlayer {
	
	private CompactDisc cd;
	
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	/*public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}*/

	public void play() {
		cd.play();
	}

}
