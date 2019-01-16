package com.zjs.bwcx.spring.aop.param.xml;

import java.util.List;

public class BlankDisc implements CompactDisc{
	
	private String title;
	private String artist;
	private List<String> tracks;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	public void play() {
		System.out.println("Playing " + title +" By " + artist);
		for(String track:tracks) {
			System.out.println("-Track: " + track);
		}
	}

	public void playTrack(Integer trackNumber) {
		if (trackNumber<=tracks.size()+1) {
			System.out.println("Playing " + tracks.get(trackNumber-1));
		}
	}

}
