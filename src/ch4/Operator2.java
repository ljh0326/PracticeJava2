package ch4;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		int input;
		System.out.println("���� �Է�");
		
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input == 0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		if(input != 0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		System.out.println("�Է��Ͻ� ���ڴ�" + input + "�Դϴ�.");
	}
}
