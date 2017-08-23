package ch5;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = new int [5];
		int k = 1; 
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];
		
		System.out.println(Arrays.toString(score));
		
		System.out.printf("tmp:%d%n", tmp);
	}	
}
