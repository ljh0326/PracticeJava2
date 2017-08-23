package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Operator19 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2D));
		System.out.println(Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr,  arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr3,  7);
		int[] arr5 = Arrays.copyOfRange(arr4,  2,  4);
		int[] arr6 = Arrays.copyOfRange(arr5,  0,  7);
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println(Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random() *6 ) +1);
		System.out.println(Arrays.toString(arr7));
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + i);
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D,  str2D2));
		System.out.println(Arrays.deepEquals(str2D,  str2D2));
		
		char[] chArr = { 'A', 'B', 'C', 'B','E'};
		
		System.out.println(chArr);
		System.out.println(Arrays.binarySearch(chArr, 'B'));
		System.out.println("After sorting");
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));
		System.out.println(Arrays.binarySearch(chArr, 'B'));
		
				
	}
}
