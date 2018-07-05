package cn.javass.spring.cxy.AOPtest.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.cxy.AOPtest.service.HelloWorldService;

public class AopTest {
	@Test
	public void testHelloworld() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:resources/helloworld3.xml");
		HelloWorldService helloworldService = ctx.getBean("helloWorldService", HelloWorldService.class);
		// helloworldService.sayHello();
		// helloworldService.sayAfterReturning();
		helloworldService.sayAround("haha");
	}
}
