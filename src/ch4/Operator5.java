package ch4;

import java.util.Scanner;

public class Operator5 {

	public static void main(String[] args) {
		System.out.println("����� �ֹι�ȣ �Է�");
		
		Scanner scanner = new Scanner(System.in);
		
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
				break;
			case '3':
				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
				break;
			}
			break;// �̰žȻ��԰� ����
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		
	}
}
