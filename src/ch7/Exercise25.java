package ch7;

import java.util.*;

class Outer{
	int value = 10;
	
	class Inner{
		int iv = 100;
		int value = 20;
		
		void method1() {
			int value = 30;
			
			System.out.println( value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	}
	
	static class Inner2{
		int iv = 200;
	}
}

public class Exercise25 {

	public static void main(String[] args) {
		Outer ot = new Outer();
		Outer.Inner in = ot.new Inner();
		
		Outer.Inner2 li = new Outer.Inner2();
		
		System.out.println(in.iv);
		System.out.println(li.iv);
		
		in.method1();
	}
}

