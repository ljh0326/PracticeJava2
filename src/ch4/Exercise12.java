package ch4;

public class Exercise12 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 3; j++) {
				int x = (j+1) + (i-1)/3*3;
				int y = i%3 == 0? 3: i%3;
				System.out.println(x+"*"+y+"="+x*y);
				
			}
		}
	}
}
