package ch4;

import java.util.Scanner;

public class Operator1 {

	public static void main(String[] args) {
		System.out.println("����(1), ����(2), ��(3) ���ϳ��� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		
		int user = scanner.nextInt();
		int computer = (int)(Math.random() * 3) + 1;
		
		System.out.println("�����" + user + "�Դϴ�.");
		System.out.println("��ǻ�ʹ�" + computer + "�Դϴ�.");
		
		switch(user - computer) {
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case -2: case 1:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("�����ϴ�.");
		}
	}
}
