package ch7;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		
		for(int i = 1 ;i <= 20 ; i ++) {
			int num = (i % 10 == 0) ? 10 : i % 10;
			boolean isKang = (i / 10 == 0 && (i == 1 || i == 3 || i == 8)) ? true : false;
			cards[i-1] = new SutdaCard(num,isKang);
		}
	}
	
	void shuffle() {
		
		for(int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random()*cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i]  = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random()*cards.length)];
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}

public class Exercise1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i]+", ");
		//7.3 조상으로부터 상속받은 메서드의 내용을 자식에 맞게 고치는 것
		//조상클래스로부터 상속받은 메서드를 자손클래스에서 그대로 사용할 수 없는경우가 많기 때문에
		
		//7.4 d 넓은범위 
		//7.5 프로덕트를 상속받은 티비 생성자에서
		//프로덕트의 기본생성자를 필요로하지만 기본생성자가 없다.
		//7.6 자손 클래스가 조상클래스의 멤버변수를 이용할 수 있기 때문
		//7.7 child()에서 parent()를 부르고 부모 x = 20dlehlsek. 
		//그 후 다시 돌아와 this(1000)을 소환하기 자식의 x를 1000으로 바꾼다.
		//결과는 1000;
		
		//7.8 퍼블릭 - 디폴트 - 프로텍티드 - 프라이빗
		//7.9 c 오버라이딩, 
	}

}
