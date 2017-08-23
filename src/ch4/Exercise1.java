package ch4;

public class Exercise1 {

	public static void main(String[] args) {
		int x = 15;
		char ch = 'x';
		int year = 400;
		boolean powerOn = true;
		String str = "yes";
		
		System.out.println(x > 10 && x < 20);
		System.out.println(!(ch == ' ' || ch == '\t'));
		System.out.println(ch == 'x' || ch == 'X');
		System.out.println(ch >= '0' && ch <= '9');
		System.out.println((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
		System.out.println(year%400 == 0 && year%4 == 0 && year%100 != 0);
		System.out.println(!(powerOn == true));
		System.out.println(str.equals("yes"));
	}

}
