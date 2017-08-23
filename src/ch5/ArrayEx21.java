package ch5;

import java.util.Scanner;


//빙고 문제푸는방법
//5 * 5인데 가로 세로 대각선체크해야한다.
//가로 읽어야해 for문하면서 

public class ArrayEx21 {

	public static void main(String[] args) {
		final int SIZE = 5;
		int bingocounter = 0;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < SIZE; i++) {
			for(int j =0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE +j +1;
			}
		}
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i = 0; i<SIZE; i++) {
				for(int j = 0; j<SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. 빙고카운터 = " + bingocounter +"(종료0)>", SIZE*SIZE);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			outer:
			for(int i = 0; i < SIZE; i++) {
				for(int  j = 0; j < SIZE; j++) {
					if(bingo[i][j]==num) {
						bingo[i][j] = 0;
						break outer;
					}
				}
			}
		}while(num!=0);
	}
}
