package ch4;

public class Exercise14 {

	public static void main(String[] args) {
		int number = 1243521;
		int tmp = number;
		
		int result = 0;
		
		while(tmp != 0) {
			result *= 10;
			result += tmp % 10;
			tmp /= 10;
		}
		
		System.out.println(result);
		
		if(number == result)
			System.out.println(number +"�� ȸ���� �Դϴ�.");
		else
			System.out.println(number +"�� ȸ������ �ƴմϴ�.");
	}
}
