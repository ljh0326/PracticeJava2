package ch5;

import java.util.Arrays;

//������� ������ ī������ �� ���� ȿ���� 
//������� ���� data range�� ���� �� ���ִµ� �Ѱ谡���� ������ �̷��� �ϴµ� ����
public class ArrayEx12 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0 ; i< numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(i +"�� ���� :"+ counter[i]);
		}
	}

}
