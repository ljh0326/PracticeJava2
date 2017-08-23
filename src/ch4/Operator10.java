package ch4;

import java.util.Scanner;

public class Operator10 {

	public static void main(String[] args) {
		int sum = 0, i = 0;

		while ((sum += ++i) < 100) {
			System.out.println(sum);
		}
	}
}
