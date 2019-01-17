package com.zjs.bwcx.aspectj.aop;

public aspect CriticAspect {

	/*private CriticismEngine criticismEngine;

	pointcut performance():execution(* com.zjs.bwcx.aspectj.aop.Performance.perform(..));
	
	AfterReturning() : performance(){
		System.out.println(criticismEngine.getCriticism());
	}
	
	after():performance(){
        System.out.println(criticismEngine.getCriticism());
    }
	
	public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }*/
	
	
	private CriticismEngine criticismEngine;

    pointcut performanced():execution(* com.zjs.bwcx.aspectj.aop.Performance.perform(..));

    pointcut construct():execution(com.zjs.bwcx.aspectj.aop.CriticismEngineImpl.new());

    after():performanced(){
        System.out.println(criticismEngine.getCriticism());
    }

    after():construct(){
        System.out.println("After Performance constructor");
    }


    before():construct(){
        System.out.println("Before Performance constructor");
    }

    public CriticismEngine getCriticismEngine() {
        return this.criticismEngine;
    }

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

}
