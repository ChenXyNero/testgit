package cn.javass.spring.cxy.AOPtest.service;

public interface HelloWorldService {
	public void sayHello();

	public boolean sayAfterReturning();

	public void sayAround(String param);
}
