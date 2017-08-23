package ch4;

import java.util.Scanner;

public class Operator5 {

	public static void main(String[] args) {
		System.out.println("당신의 주민번호 입력");
		
		Scanner scanner = new Scanner(System.in);
		
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
				break;
			case '3':
				System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
				break;
			}
			break;// 이거안빼먹게 조심
			default:
				System.out.println("유효하지 앟은 주민등록번호입니다.");
		}
		
	}
}
