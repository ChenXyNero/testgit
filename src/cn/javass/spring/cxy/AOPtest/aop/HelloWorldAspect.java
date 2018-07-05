package cn.javass.spring.cxy.AOPtest.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class HelloWorldAspect {
	// 前置通知
	public void beforeAdvice(String param) {
		System.out.println("===========before advice" + param);
	}

	public void afterReturningAdvice(Object retVal) {
		System.out.println("===========after returning advice retVal:" + retVal);
	}

	// 后置最终通知
	public void afterFinallyAdvice() {
		System.out.println("===========after finally advice");
	}

	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("===========around before advice");
		Object retVal = pjp.proceed(new Object[] { "replace" });
		System.out.println("===========around after advice");
		return retVal;
	}
}
