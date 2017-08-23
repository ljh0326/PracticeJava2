package ch5;

import java.util.Arrays;

public class ArrayText {

	public static void main(String[] args) {
		int[] arr = new int[5];
		;
		
		for(int i = 0; i < arr.length; i ++)
			System.out.println(arr[i]);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int tmp = arr[0];
				
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > tmp) {
				tmp = arr[i];
			}
		}
			
		System.out.println(tmp);
	}	

}
