package cn.javass.spring.cxy.AOPtest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class HelloWorldAspect2 {
	@Pointcut(value = "execution(* cn.javass..*.sayAround(..)) && args(param)", argNames = "param")
	public void beforePointcut(String param) {
	}

	// 前置通知
	@Before(value = "beforePointcut(param)", argNames = "param")
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
