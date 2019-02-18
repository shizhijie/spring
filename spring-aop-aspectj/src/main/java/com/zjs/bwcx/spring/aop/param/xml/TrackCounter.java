package com.zjs.bwcx.spring.aop.param.xml;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {

	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

	@Pointcut("execution(* com.zjs.bwcx.spring.aop.param.xml.CompactDisc.playTrack(Integer)) && args(trackNumber)")
	public void trackPlayed(int trackNumber) {
	}

	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		System.out.println("TrackerCounter:" + trackNumber);
		trackCounts.put(trackNumber, currentCount + 1);
	}
	
	public int getPlayCount(int trackNumber) {
		return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
	}

	@Before("execution(* com.zjs.bwcx.spring.aop.param.xml.CompactDisc.play())")
	public void test2() {
		System.out.println("this is trackCounter test2");
	}

	@Before("execution(* com.zjs.bwcx.spring.aop.param.xml.CompactDisc.play())")
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
