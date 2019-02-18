package com.zjs.bwcx.aspectj.aop;

public class CriticismEngineImpl implements CriticismEngine {

	public CriticismEngineImpl() {
	}

	// injected
	private String[] criticismPool;

	@Override
	public String getCriticism() {
		int i = (int) (Math.random() * criticismPool.length);
		return criticismPool[i];
	}

	public void setCriticismPool(String[] criticismPool) {
		this.criticismPool = criticismPool;
	}

}
