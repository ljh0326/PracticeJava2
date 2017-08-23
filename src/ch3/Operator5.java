package ch3;

public class Operator5 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a + b);
		System.out.println(c);
		
		byte d = (byte)(a * b);
		System.out.println(d);
		
		int e = 1_000_000;
		long f = 2_000_000;
		
		System.out.println(e);
		
		long g = e * f;
		System.out.println(g);
	}

}
