package ch7;

import java.util.Vector;

public class Operator22 {	
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.sumarry();
	}
}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product() {};
}

class Tv extends Product {
	Tv(){super(100);}
	
	public String toString() {return "TV";}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println((p + "을 구매하셨습니다."));
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void sumarry() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += i==0 ? "" + p : ", " + p;
		}
		System.out.println(sum);
		System.out.println(itemList);
	}
}

