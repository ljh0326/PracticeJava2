package ch4;

import java.util.Scanner;

public class Operator8 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.println("�����Է�");
		
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		while(num != 0) {
			sum += num%10;
			num /= 10;
			
			System.out.println(num + " " + sum);
		}
		
		System.out.println("���ڸ����� �� = " + sum);
	}
}
