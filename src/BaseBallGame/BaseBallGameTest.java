package BaseBallGame;

import java.util.Scanner;


class BaseBallGame {

	final int num = 3;
	int[] src = new int[num];
	int[] tag = new int[num];

	BaseBallGame() {
		for (int i = 0; i < num; i++) {
			src[i] = (int)(Math.random()* 9) + 1;
		}
	}

	String check(int[] src, int[] tag) {
		int Ball = 0;
		int Strike = 0;
		for (int i = 0; i < src.length; i++) {
			for (int j = 0; j < tag.length; j++) {
				if (src[i] == tag[j] && i == j)
					Strike++;
				else if (src[i] == tag[j] && i != j)
					Ball++;
			}
		}
		
		return "볼 : " + Ball + " 스트라이크 : " + Strike;
	}

}

public class BaseBallGameTest {

	public static void main(String[] args) {

		BaseBallGame bg = new BaseBallGame();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해 주세요");

		while (true) {
			String num = sc.next();
			for (int i = 0; i < bg.num; i++) {
				bg.tag[i] = num.charAt(i) - '0';
			}
			System.out.println(bg.check(bg.src, bg.tag));
		}

	}

}
