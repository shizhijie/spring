package com.zjs.bwcx.spring.xml.literalvalue;

import java.util.List;

import com.zjs.bwcx.spring.xml.CompactDisc;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}


	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	

	public BlankDisc(String title) {
		this.title = title;
	}



	public void play() {
		System.out.println("playing " + title + " by " + artist);
		
		for(String track:tracks) {
			System.out.println("-Track: " + track);
		}
		
	}

}
