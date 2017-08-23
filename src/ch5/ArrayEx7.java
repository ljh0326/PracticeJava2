package ch5;

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i< numArr.length ; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
		System.out.println(numArr);
	}

}
