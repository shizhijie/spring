package com.zjs.bwcx.spring.aop.concert2;

public class Singer implements Performance{

	public void perform() {
		System.out.println("shizhijie 开始表演梁山伯与祝英台歌剧");
		System.out.println(1/0);
	}

}
