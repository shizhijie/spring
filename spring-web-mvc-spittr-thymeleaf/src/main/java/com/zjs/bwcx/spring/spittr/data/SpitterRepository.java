package com.zjs.bwcx.spring.spittr.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("spitterRepository")
public class SpitterRepository {
	
	private Map<String, Spitter> map = new HashMap<>();
	
	public void save(Spitter spitter) {
		map.put("spitter", spitter);
	}
	
	public Spitter getSpitter() {
		return map.get("spitter");
	}

}
