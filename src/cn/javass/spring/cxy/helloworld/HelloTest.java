package cn.javass.spring.cxy.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	@Test
	public void testInstantiatingBeanByConstructor() {
		// 使用构造器
		ApplicationContext parentBeanContext = new ClassPathXmlApplicationContext("file:resources/helloworld2.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "file:resources/helloworld.xml" }, parentBeanContext);
		HelloApi bean1 = context.getBean("bean1", HelloApi.class);
		bean1.sayHello();
		HelloApi bean2 = context.getBean("bean2", HelloApi.class);
		bean2.sayHello();
		HelloApi bean3 = context.getBean("bean3", HelloApi.class);
		bean3.sayHello();
		HelloApi bean4 = context.getBean("bean4", HelloApi.class);
		bean4.sayHello();
		HelloApi bean5 = context.getBean("bean5", HelloApi.class);
		bean5.sayHello();

		ListTestBean listTestBean = context.getBean("bean7", ListTestBean.class);
		System.out.println(listTestBean.getValues().size());
		System.out.println(listTestBean.getValues());

		MapTestBean mapTestBean = context.getBean("bean8", MapTestBean.class);
		System.out.println(mapTestBean.getValues());
		System.out.println(listTestBean.getValues().size());

		HelloApi bean9 = context.getBean("bean9", HelloApi.class);
		bean9.sayHello();
		// 通过setter方式注入
		HelloApi bean10 = context.getBean("bean10", HelloApi.class);
		bean10.sayHello();

		HelloApi bean12 = context.getBean("bean12", HelloApi.class);
		bean12.sayHello();

		HelloApi bean13 = context.getBean("bean13", HelloApi.class);
		bean13.sayHello();

		HelloApi bean14 = context.getBean("bean14", HelloApi.class);
		bean14.sayHello();
	}
}
