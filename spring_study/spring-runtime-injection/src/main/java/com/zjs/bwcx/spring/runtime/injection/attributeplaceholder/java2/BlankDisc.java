package com.zjs.bwcx.spring.runtime.injection.attributeplaceholder.java2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {

	@Value("${disc.title}")
	private String title;
	@Value("${disc.artist}")
	private String artist;
	
	public void play() {
		System.out.println(artist + "演奏" + title);
	}

}
