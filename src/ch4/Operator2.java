package ch4;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		int input;
		System.out.println("숫자 입력");
		
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input == 0)
			System.out.println("입력하신 숫자는 0입니다.");
		if(input != 0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		System.out.println("입력하신 숫자는" + input + "입니다.");
	}
}
