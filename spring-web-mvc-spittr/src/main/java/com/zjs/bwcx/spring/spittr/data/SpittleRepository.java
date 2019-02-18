package com.zjs.bwcx.spring.spittr.data;

import java.util.List;

public interface SpittleRepository {
	/**
	 * @param max   待	返回的最大的Spittle ID
	 * @param count 返回Spittle对象的个数
	 * @return
	 */
	List<Spittle> findSpittles(long max, int count);

	Object findOne(long spittled);
}
