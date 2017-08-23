package ch3;

public class Exercise9 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9'));
		System.out.println(b);
	}
}