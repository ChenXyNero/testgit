package cn.javass.spring.cxy.navigation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testNavigationBeanInject {
	@Test
	public void testNavigationBeanInject() {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:resources/navigationBeanInject.xml");
		NavigationA navigationA = context.getBean("a", NavigationA.class);
		navigationA.getNavigationB().getNavigationC().sayNavigation();
		navigationA.getNavigationB().getList().get(0).sayNavigation();
		navigationA.getNavigationB().getMap().get("key").sayNavigation();
		navigationA.getNavigationB().getArray()[0].sayNavigation();
		((NavigationC) navigationA.getNavigationB().getProperties().get("1")).sayNavigation();
	}
}
