package ch4;

import java.util.Scanner;

public class Operator13 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;
		
		
		System.out.println("�հԸ� ���� ���ڸ� �Է�");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			
			if(num != 0) {
				sum += num;
			}
			else
				flag = false;
		}
		System.out.println(sum);
	}
}
