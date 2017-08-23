package ch4;

import java.util.Scanner;

public class Operator6 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40 , 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		for(int tmp : arr) {
			System.out.println(tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}
}
