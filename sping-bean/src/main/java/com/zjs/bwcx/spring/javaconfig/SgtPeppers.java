package com.zjs.bwcx.spring.javaconfig;


/*@Component*/
/*@Component("lonelyHeartsClub")*/
/*@Component*/
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
