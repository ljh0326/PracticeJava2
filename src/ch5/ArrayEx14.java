package ch5;

import java.util.Arrays;

//문자열을 문자배열로 만드는 방법과 문자배열을 문자열을 만드는 방법
public class ArrayEx14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println(ch);
		}
		
		char[] chArr = src.toCharArray();
		
		System.out.println(chArr);
	}
}
