package com.zjs.bwcx.spring.xml;

public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
