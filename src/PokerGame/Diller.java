package PokerGame;

public class Diller {
	Card[] cArr = new Card[3];
	
	Diller() {
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] = new Card();
		}
	}
}
