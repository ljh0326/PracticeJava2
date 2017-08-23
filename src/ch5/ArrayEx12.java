package ch5;

import java.util.Arrays;

//기수정렬 데이터 카운팅할 때 가장 효율적 
//기수정렬 단점 data range가 좁음 쓸 수있는데 한계가있음 설문지 이런거 하는데 좋음
public class ArrayEx12 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0 ; i< numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(i +"의 개수 :"+ counter[i]);
		}
	}

}
