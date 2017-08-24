package ch7;

import java.util.Arrays;

public class Exercise19 {

	
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Tv2());
		b.buy(new Audio2());
		b.buy(new Computer2());
		b.buy(new Computer2());
		b.buy(new Computer2());
		
		b.summary();
		
	}
}

class Buyer2{
	
	int money = 1000;
	Product2[] cart = new Product2[3];
	int i =0;
	
	void buy(Product2 p) {
		if(p.price > money) {
			System.out.println(p + "를 구입할 돈이 부족합니다.");
			return;
		}	
		money -= p.price;
		add(p);
	}
	
	void add(Product2 p) {
		if(i >= 3) {
			Product2[] tmp = new Product2[cart.length * 2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++] = p;
	}
	
	void summary() {
		int total_money = 0;
		String itemList = "";
	    
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			total_money += cart[i].price;
			itemList += cart[i] + ", ";
		}
		
		System.out.println("구입한 제품 :" + itemList);
		System.out.println("총 금액 : " + total_money);
		System.out.println("남은 금액 : " + money);
	}
	
}

class Product2{
	int price;
	
	Product2(int price){
		this.price = price;
	}
}

class Tv2 extends Product2{
	Tv2() {super(100);}
	
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2{
	Computer2() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2{
	Audio2() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

//20번 100 차일드메서드 200 차일드메서드
//21번 Movable을 구현한 객체 

