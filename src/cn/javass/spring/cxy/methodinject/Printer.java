package cn.javass.spring.cxy.methodinject;

public class Printer {
	private int counter = 0;

	public void print(String type) {
		System.out.println(type + " printer: " + counter++);
	}
}
