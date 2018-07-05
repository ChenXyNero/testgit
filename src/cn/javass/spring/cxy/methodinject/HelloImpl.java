package cn.javass.spring.cxy.methodinject;

public abstract class HelloImpl implements HelloApi {
	private Printer printer;

	public void sayHello() {
		printer.print("setter");
		createPrototypePrinter().print("prototype");
	}

	public abstract Printer createPrototypePrinter();

	public Printer createSingletonPrinter() {
		System.out.println("�÷������ᱻִ�У��������ʹ���");
		return new Printer();
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
}
