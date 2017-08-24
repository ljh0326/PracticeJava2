package PokerGame;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Deck extends Card {

	Card[][] cardArr = new Card[Card.KIND_MAX][Card.NUM_MAX];

	Deck() {
		int i = 0;

		for (int k = 0; k < Card.KIND_MAX; k++) {
			for (int n = 1; n < Card.NUM_MAX; n++) {
				cardArr[k][n] = new Card(k, n);
			}
		}
	}

	Card pick(int kind, int num) {
		return cardArr[kind][num];
	}

	Card pick() {
		int kind = (int) (Math.random() * Card.KIND_MAX);
		int num = (int) (Math.random() * Card.NUM_MAX - 1) + 1;
		return pick(kind, num);
	}
}

class Card implements Comparable {
	int num1 = 0;

	@Override
	public int compareTo(Object o) {
		if (o instanceof Card) {
			Card c1 = (Card) o;

			num1 = this.num - c1.num;

			if (num1 == 0) {
				return (this.kind - c1.kind);
			} else
				return num1;
		}
		return -1;
	}

	static final int KIND_MAX = 4;
	static final int NUM_MAX = 14;

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind; // 1~4의 값을 갖는다.(1:club, 2:heart, 3:diamond, 4:spade)
	int num; // 1~13의 값을 갖는다.
	int rank;

	int[] nkind = new int[4];
	int[] nnum = new int[13 + 1];

	Card() {
	}

	Card(int kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	public String toString() {
		String[] kinds = { "♣", "♥", "◆", "♠" };
		String numbers = "0123456789XJQK";
		return kinds[this.kind] + " " + numbers.charAt(this.num);
	}

	// 정렬ㅌ

	// 타입체크
	String check(Card[] cArr) {
		int pair = 0;
		int stCnt = 0;
		int flag = 0;

		boolean strike = false;
		boolean flush = false;
		boolean three = false;
		boolean four = false;
		boolean isStrike = false;

		// 반복을 위한 기수정렬 초기화
		for (int i = 0; i < 5; i++) {
			nkind[cArr[i].kind] = 0;
			nnum[cArr[i].num] = 0;
		}
		for (int i = 0; i < 14; i++) {
			nnum[i] = 0;
		}

		// 기수정렬
		for (int i = 0; i < 5; i++) {
			nkind[cArr[i].kind]++;
			nnum[cArr[i].num]++;
		}

		// kind 종류다돌아서 i가 5개면 플러쉬
		for (int i = 0; i < 4; i++) {
			if (nkind[i] == 5)
				flush = true;
		}

		// 숫자 조사
		for (int i = 1; i < 14; i++) {
			// switch로 바꾸자
			if (nnum[i] == 2)
				pair++;
			if (nnum[i] == 3)
				three = true;
			if (nnum[i] == 4)
				four = true;

			if (nnum[i] != 0)
				stCnt++;
			else
				stCnt = 0;

			if (stCnt == 5)
				strike = true;

		}
		// // 스트라이크 예외처리
		// if (nnum[1] == 1) {
		// isStrike = isStrke(1);
		// }
		// if (nnum[2] == 1) {
		// isStrike = isStrke(2);
		// }
		// if (nnum[3] == 1) {
		// isStrike = isStrke(3);
		// }
		// if (nnum[4] == 1) {
		// isStrike = isStrke(4);
		// }

		if ((strike && flush))       return "strightflush"; 
		else if (four)               return "four card";
		else if (pair == 1 && three) return "fullhouse";
		else if (flush)              return "flush";
		else if (strike)             return "straght";
		else if (three)              return "three card";
		else if (pair == 2)          return "two pair";
		else if (pair == 1)          return "one pair";
		else                         return "noRank";
		
	}

	// // 스트라이트 예외 처리
	// boolean isStrke(int num) {
	//
	// int count = 0;
	//
	// if (num == 1) {
	// for (int i = nnum.length - 4; i < nnum.length; i++) {
	// if(nnum[i] == 1)
	// count++;
	// if (count == 4) {
	// return true;
	// }
	// }
	// } else if (num == 2) {
	// for (int i = nnum.length - 3; i < nnum.length; i++) {
	// if(nnum[i] == 1)
	// count++;
	// if (count == 3) {
	// return true;
	// }
	// }
	// } else if (num == 3) {
	// for (int i = nnum.length - 2; i < nnum.length; i++) {
	// if(nnum[i] == 1)
	// count++;
	// if (count == 2) {
	// return true;
	// }
	// }
	// } else if (num == 4) {
	// for (int i = nnum.length - 1; i < nnum.length; i++) {
	// if(nnum[i] == 1)
	// count++;
	// if (count == 1) {
	// return true;
	// }
	// }
	// }
	// return false;
	// }
}

public class PokerGame {
	int flag;
	int money = 0;
	Scanner sc = new Scanner(System.in);

	Deck deck = new Deck();

	Diller diller = new Diller();
	Player player1 = new Player();
	Player player2 = new Player("컴퓨터", 5000);

	Card[] cArr = new Card[5];
	Card[] cArr2 = new Card[5];

	PokerGame() {

	}

	void playGame() {
		System.out.println("플레이 포커 !!!!!!!!");
		System.out.println();
		PlayerSet();

		while (true) {
			getNewCard();
			dillerSet();
			setCardArr();

			System.out.println();
			System.out.println("딜러 패 공개");
			Arrays.sort(diller.cArr);
			System.out.println(Arrays.toString(diller.cArr));
			System.out.println();
			Arrays.sort(player1.cArr);
			System.out.println("당신의 패");
			System.out.println(Arrays.toString(player1.cArr));
			System.out.println();
			System.out.println("배팅 하시겠습니까?");
			System.out.println("배팅 : 1, Die : 2");
			flag = sc.nextInt();

			if (flag == 1) {
				batting();
				System.out.println();
				System.out.println(player1.name + " " + deck.check(cArr));
				System.out.println(player2.name + " " + deck.check(cArr2));
				whoWin();

			} else if (flag == 2) {
				die();
			}

			if (player1.money <= 0) {
				System.out.println();
				System.out.println(player1.bankrub() + "GAMEOVER");
				break;
			}
			if (player2.money <= 0) {
				System.out.println();
				System.out.println("You Win!! GAME OVER");
				break;
			}
		}

	}

	void getNewCard() {
		for (int i = 0; i < 2; i++) {
			player1.cArr[i] = deck.pick();
			player2.cArr[i] = deck.pick();
		}
	}

	void whoWin() {
		int rank1 = 0;
		int rank2 = 0;

		rank1 = pokerRank(cArr);
		rank2 = pokerRank(cArr2);

		if (rank1 > rank2) {
			System.out.println();
			System.out.println(player1.name + " Win!!");
			System.out.println("배당금2배의 게임머니를 획득하셨습니다.");
			player1.money += (money * 2);
			player2.money -= money;
			System.out.println(player1.name + "금액" + player1.money);
			System.out.println(player2.name + "금액" + player2.money);
			System.out.println();
		} else if (rank1 < rank2) {
			System.out.println(player2.name + " Win!!");
			player2.money += (money * 2);
			System.out.println();
			System.out.println("배당금을 잃으셨습니다.");
			System.out.println(player1.name + "금액" + player1.money);
			System.out.println(player2.name + "금액" + player2.money);
			System.out.println();
		} else if (rank1 == rank2) {
			System.out.println("무승부");
			System.out.println("배당금을 돌려받았습니다.");
			player1.money += money;
			System.out.println(player1.name + "금액" + player1.money);
			System.out.println(player2.name + "금액" + player2.money);
			System.out.println();
		}

	}

	int pokerRank(Card[] cArr) {
		int num = 0;

		if      (deck.check(cArr).equals("strightflush")) num = 8;
		else if (deck.check(cArr).equals("four card"))    num = 7;
		else if (deck.check(cArr).equals("fullhouse"))    num = 6;
		else if (deck.check(cArr).equals("flush"))        num = 5;
		else if (deck.check(cArr).equals("straght"))      num = 4;
		else if (deck.check(cArr).equals("three card"))   num = 3;
		else if (deck.check(cArr).equals("two pair"))     num = 2;
		else if (deck.check(cArr).equals("one pair"))     num = 1;
		else if (deck.check(cArr).equals("noRank"))       num = 0;
		
		return num;
	}

	void setCardArr() {
		System.arraycopy(diller.cArr, 0, cArr, 0, diller.cArr.length);
		System.arraycopy(player1.cArr, 0, cArr, 3, player1.cArr.length);

		System.arraycopy(diller.cArr, 0, cArr2, 0, diller.cArr.length);
		System.arraycopy(player2.cArr, 0, cArr2, 3, player2.cArr.length);
	}

	void die() {
		player1.money -= 100;
		System.out.println(player1.name + "금액" + player1.money);
	}

	void batting() {
		System.out.println();
		System.out.println("얼마를 배팅하시겠습니까?");
		money = sc.nextInt();

		player1.money -= money;
		System.out.println();
		System.out.println(player1.name + "금액" + player1.money);
		System.out.println(player2.name + "금액" + player2.money);
	}

	void dillerSet() {
		for (int i = 0; i < 3; i++) {
			diller.cArr[i] = deck.pick();
		}
	}

	void PlayerSet() {
		String name = "";
		int money = 0;

		System.out.println("플레이어 설정");

		System.out.println("플레이어 이름을 입력해주세요");
		name = sc.next();
		System.out.println("플레이어1 돈을 설정해주세요");
		money = sc.nextInt();

		player1 = new Player(name, money);
	}
}
