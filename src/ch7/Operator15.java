package ch7;

public class Operator15 {	
	public static void main(String[] args) {
		Car car = null;
		Car car2 = new Car();
		FireCar f1 = new FireCar();
		FireCar f2 = null;
		
		f1.water();
		car = f1;
		f2 = (FireCar)car;
		f2.water();
		
		//car2 = f1;
		
		f2 = (FireCar)car2;
		f2.water();
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireCar extends Car{
	void water() {
		System.out.println("Water!!!!!!!");
	}
}


