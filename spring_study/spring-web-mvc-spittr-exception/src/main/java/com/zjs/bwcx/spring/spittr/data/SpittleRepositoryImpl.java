package com.zjs.bwcx.spring.spittr.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("spittleRepositoryImpl")
public class SpittleRepositoryImpl implements SpittleRepository {

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> spittleList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			spittleList.add(new Spittle("Spittle (from IMPL) ID#" + i, new Date(11111111)));
		}
		return spittleList;
	}

	@Override
	public Object findOne(long spittled) {
		return new Spittle("Hello World!The first over spittle", new Date());
	}

}
