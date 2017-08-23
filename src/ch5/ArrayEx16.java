package ch5;

import java.util.Arrays;

public class ArrayEx16 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		System.out.println("매개변수의 개수:"+args.length);
		for(int i =0; i < args.length; i++) {
			System.out.println("args["+i+"]= \""+args[i] + "\"");
		}
	}
}
