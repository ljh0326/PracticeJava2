package ch7;

public class Operator17 {	
	public static void main(String[] args) {
		FireCar fe 
		= new FireCar();
		Car car = new Car();
		
		if(car instanceof Object) {
			System.out.println("�� ī�� Object�� �����̿�");
		}
		if(car instanceof FireCar) {
			System.out.println("�� �ڽ����δ� ����ȯ�� �ȵ� ���°� ������ ���� �̤�");
		}
		if(fe instanceof FireCar) {
			System.out.println("This is a Fire instance");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object);{
			System.out.println("This is an Object instance");
		}
		
		System.out.println(fe.getClass().getName()); // Ŭ������ �̸��� ��� 
	}
}



