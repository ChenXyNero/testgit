package cn.javass.spring.cxy.helloworld;

public class HelloApiStaticFactory {
	// ��������
	public static HelloApi newInstance(String message) {
		// ������Ҫ��Beanʵ��
		return new HelloImpl2(message);
	}
}
