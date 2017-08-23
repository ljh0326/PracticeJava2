package ch7;

public class Operator5 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.hello();
	}
}

class Parent{
	int x = 10;
	
	void hello() {
		System.out.println("¾È³ç ¾Æµé¾Æ");
	}
}

class Child extends Parent{
	
	int x = 20;
	
	void method() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		super.hello();
	}
	
	@Override
	void hello() {
		System.out.println("¾È³ç ¾Æºü");
	}
}