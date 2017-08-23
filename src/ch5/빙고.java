package ch5;

import java.util.Scanner;

//빙고 문제푸는방법
//5 * 5인데 가로 세로 대각선체크해야한다.
//가로 읽어야해 for문하면서 

public class 빙고 {

	public static void main(String[] args) {
		final int SIZE = 5;
		int bCnt = 0;

		int x = 0, y = 0, num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);

		initBingo(SIZE, bingo);
		shuffle(SIZE, bingo);

		
		do {
			printBingo(SIZE, bingo);

			System.out.printf("1~%d의 숫자를 입력하세요. 빙고카운터 = " + bCnt + "(종료0)>", SIZE * SIZE);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer;
					}
				}
			}
			
			// bingo체크
			int gCnt = 0;   //가로 빙고체크를 위한 변수
			int sCnt = 0;	//세로 빙고체크를 위한 변수	
			int cCnt = 0;	//대각선 빙고체크를 위한 변수
			int cCnt2 = 0;  //반대대각선 체크를 위한 변수
			
			
			bCnt = 0;
			
			for (int i = 0; i < SIZE; i++) {
				gCnt = sCnt = 0;
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == 0) gCnt++;
//					if (bingo[j][i] == 0) sCnt++;
//					if(i == j && bingo[i][j] == 0)
//						cCnt++;
//					if(j+j==4 && bingo[i][j] == 0)
//						cCnt2++;
					
					if (gCnt == 5) bCnt++;
//					if (sCnt == 5) bCnt++;
//					if (cCnt == 5) bCnt++;
//					if (cCnt2 == 5) bCnt++;
				}	
			}
		} while (num != 0);
	}

	private static void printBingo(final int SIZE, int[][] bingo) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++)
				System.out.printf("%2d ", bingo[i][j]);
			System.out.println();
		}
		System.out.println();
	}

	private static void initBingo(final int SIZE, int[][] bingo) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}
	}

	private static void shuffle(final int SIZE, int[][] bingo) {
		int x;
		int y;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
	}
}
