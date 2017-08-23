package ch7;

public class Operator17 {	
	public static void main(String[] args) {
		FireCar fe 
		= new FireCar();
		Car car = new Car();
		
		if(car instanceof Object) {
			System.out.println("난 카고 Object가 조상이여");
		}
		if(car instanceof FireCar) {
			System.out.println("아 자식으로는 형변환이 안돼 없는걸 쓸수는 없어 ㅜㅜ");
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
		
		System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력 
	}
}



