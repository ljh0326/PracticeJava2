package ch5;

import java.util.Arrays;

//���߹迭 ���� for�� ó��
public class ArrayEx18 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int sum = 0;
		
		for(int [] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
