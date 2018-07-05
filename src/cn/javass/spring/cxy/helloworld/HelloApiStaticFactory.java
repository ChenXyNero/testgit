package cn.javass.spring.cxy.helloworld;

public class HelloApiStaticFactory {
	// 工厂方法
	public static HelloApi newInstance(String message) {
		// 返回需要的Bean实例
		return new HelloImpl2(message);
	}
}
