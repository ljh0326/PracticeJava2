package ch5;

import java.util.Arrays;

//������� ������ ī������ �� ���� ȿ���� 
//������� ���� data range�� ���� �� ���ִµ� �Ѱ谡���� ������ �̷��� �ϴµ� ���� ���ĺ��̳� �̷��� ȿ����
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
			System.out.println(i +"�� ���� :"+ counter[i]);
		}
	}

}
