package com.zjs.bwcx.spring.xml.literalvalue;

import java.util.List;

import com.zjs.bwcx.spring.xml.CompactDisc;
@SuppressWarnings("unused")
public class Discography {
	
	
	private String artist;
	private List<CompactDisc> cds;
	
	public Discography(String artist, List<CompactDisc> cds) {
		this.artist = artist;
		this.cds = cds;
	}
}
