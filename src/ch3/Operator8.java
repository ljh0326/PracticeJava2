package ch3;

import java.util.Scanner;

public class Operator8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("���� �Է�");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9')
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'))
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
	}
}
