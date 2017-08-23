package ch5;

import java.util.Arrays;

//기수정렬 데이터 카운팅할 때 가장 효율적 
//기수정렬 단점 data range가 좁음 쓸 수있는데 한계가있음 설문지 이런거 하는데 좋음
public class ArrayEx13 {

	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = {"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111", 
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111" };
		
		String result = "";
		
		for(int i =0 ; i < hex.length ; i++) {
			if(hex[i] >= '0' && hex[i] <= '9')
				result += binary[hex[i] -'0'];
			else
				result += binary[hex[i]-'A' + 10];
		}
		System.out.println(new String(hex));
		System.out.println(result);
	}
}
