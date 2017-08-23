package ch7;

public class Operator19 {	
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println(p.x);
		c.method();
		System.out.println(c.x);
		
	}
}



