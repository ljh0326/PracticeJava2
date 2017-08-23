package ch7;

public class Operator24 {	
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit2) {
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable인터페이스를 구현");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object의 자손입니다.");
		}
	}
}

class Fighter extends Unit2 implements Movable, Attackable{
	public void move(int x, int y) {
		
	}
	public void attack(Unit2 u) {
		
	}
}

class Unit2{
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable{
	
}

interface Movable {
	void move (int x, int y);
}

interface Attackable{
	void attack(Unit2 u);
}


