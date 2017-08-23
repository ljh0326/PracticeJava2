package ch6;

public class Exercise1 {

	public static void main(String[] args) {
		SutdaCard card1  = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard{
	int num = (int)(Math.random()*10) + 1;
	boolean iskwang = true;
	
	SutdaCard(int num, boolean iskwang){
		this.num = num;
		this.iskwang = iskwang;
	}
	
	SutdaCard(){
		this(1, true);
	}
	
	String info() {
		return "" + num + (iskwang? "K" : "");
	}
}
