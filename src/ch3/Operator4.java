package ch3;

public class Operator4 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'a' + 1;
		char c = 'a';
				
		System.out.println(c2);
		
		for(int i = 0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c = 'A';
		for(int i = 0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c='0';
		for(int i = 0; i<10; i++) {
			System.out.print(c++);
		}
		
	}

}
