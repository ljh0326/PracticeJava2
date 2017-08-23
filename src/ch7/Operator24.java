package ch7;

public class Operator24 {	
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit2) {
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� ����");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable�������̽��� ����");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable�������̽��� ����");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object�� �ڼ��Դϴ�.");
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


