package cn.javass.spring.cxy.AOPtest.service.impl;

import cn.javass.spring.cxy.AOPtest.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
	@Override
	public void sayHello() {
		System.out.println("============Hello World!");
	}

	@Override
	public boolean sayAfterReturning() {
		System.out.println("============after returning");
		return true;
	}

	@Override
	public void sayAround(String param) {
		// TODO Auto-generated method stub
		System.out.println("============around param:" + param);
	}
}
