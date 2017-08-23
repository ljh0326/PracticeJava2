package ch5;

import java.util.Arrays;

//기수정렬 데이터 카운팅할 때 가장 효율적 
//기수정렬 단점 data range가 좁음 쓸 수있는데 한계가있음 설문지 이런거 하는데 좋음 알파벳이나 이런거 효율적
public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0 ; i< numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			
			while(counter[numArr[i]] >= 1)	
				numArr[i] = (int)(Math.random() * 10);
			
			counter[numArr[i]]++;
		}
		System.out.println();
		
		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(i +"의 개수 :"+ counter[i]);
		}
	}

}
