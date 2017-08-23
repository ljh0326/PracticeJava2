package ch7;

public class Operator7 {

	public static void main(String[] args) {
		Deck d = new Deck();      //카드 한벌 생성
		Card c = d.pick();        //섞기 전에 가장 위의 카드 뽑는다.
		System.out.println(c);    
		
		d.shuffle();              //카드 섞고
		c = d.pick();             //섞은 후에 카드를 뽑는다. 
		System.out.println(c);
	}

}

class Deck{
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM];
	
	//카드 초기화
	Deck() {
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--) {
			for(int n = 0; n < Card.NUM_MAX; n++){
				cardArr[i++] = new Card(k, n+1);
			}
		}
	}
	
	Card pick(int index) {
		return cardArr[index];
	}
	
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}


class Card{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE   = 4;
	static final int DIAMOND = 3;
	static final int HEART   = 2;
	static final int CLOVER  = 1;
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";  // 10 = X
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
	
}