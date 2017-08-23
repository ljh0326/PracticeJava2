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
		//7.3 �������κ��� ��ӹ��� �޼����� ������ �ڽĿ� �°� ��ġ�� ��
		//����Ŭ�����κ��� ��ӹ��� �޼��带 �ڼ�Ŭ�������� �״�� ����� �� ���°�찡 ���� ������
		
		//7.4 d �������� 
		//7.5 ���δ�Ʈ�� ��ӹ��� Ƽ�� �����ڿ���
		//���δ�Ʈ�� �⺻�����ڸ� �ʿ�������� �⺻�����ڰ� ����.
		//7.6 �ڼ� Ŭ������ ����Ŭ������ ��������� �̿��� �� �ֱ� ����
		//7.7 child()���� parent()�� �θ��� �θ� x = 20dlehlsek. 
		//�� �� �ٽ� ���ƿ� this(1000)�� ��ȯ�ϱ� �ڽ��� x�� 1000���� �ٲ۴�.
		//����� 1000;
		
		//7.8 �ۺ� - ����Ʈ - ������Ƽ�� - �����̺�
		//7.9 c �������̵�, 
	}

}
