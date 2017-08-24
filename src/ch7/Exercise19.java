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
			System.out.println(p + "�� ������ ���� �����մϴ�.");
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
		
		System.out.println("������ ��ǰ :" + itemList);
		System.out.println("�� �ݾ� : " + total_money);
		System.out.println("���� �ݾ� : " + money);
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

//20�� 100 ���ϵ�޼��� 200 ���ϵ�޼���
//21�� Movable�� ������ ��ü 

