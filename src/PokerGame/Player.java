package PokerGame;

public class Player {
	String name;
	int money;
	Card[] cArr = new Card[2];
	
	
	Player(String name, int money) {
		this.name = name;
		this.money = money;
		for(int i = 0 ; i < cArr.length; i++) {
			cArr[i] = new Card();
		}
	}
	
	Player(){
		this("�÷��̾�",5000);
	}
	
	void Batting(int num) {
		this.money -= num;
	}
	
	String bankrub() {
		return "�Ļ��ϼ̽��ϴ�.";
	}
	
}
