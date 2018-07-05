package cn.javass.spring.cxy.helloworld;

public class HelloImpl4 implements HelloApi {
	private String message;
	private int index;

	public HelloImpl4() {

	}

	public HelloImpl4(String message, int index) {
		this.message = message;
		this.index = index;
	}

	// setter·½·¨
	public void setMessage(String message) {
		this.message = message;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(index + ":" + message);
	}

}
