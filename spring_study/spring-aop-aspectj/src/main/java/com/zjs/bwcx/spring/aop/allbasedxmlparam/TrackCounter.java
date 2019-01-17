package com.zjs.bwcx.spring.aop.allbasedxmlparam;

import java.util.HashMap;
import java.util.Map;

public class TrackCounter {

	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

	public void countTrack(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		System.out.println("TrackerCounter:" + trackNumber);
		trackCounts.put(trackNumber, currentCount + 1);
	}
	
	public int getPlayCount(int trackNumber) {
		return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
	}

	public void test2() {
		System.out.println("this is trackCounter test2");
	}

	public void test1() {
		System.out.println("this is trackCounter test1");
	}
	
	/*@AfterReturning("trackPlayed(trackNumber)")
	public void getMap(int trackNumber) {
		PrintMap();
	}*/

	public void PrintMap() {
		trackCounts.forEach((k, v) -> System.out.println("Key:" + k + ",Value:" + v));
	}
	
}
