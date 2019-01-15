package com.zjs.bwcx.spring.runtime.injection;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	
	public BlankDisc() {
		super();
	}

	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public void play() {
		System.out.println(artist + "演奏" + title);
	}

}
