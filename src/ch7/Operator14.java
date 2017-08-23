package ch7;

public class Operator14 {	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
	}
}

final class Singleton{
	
	static Singleton s = new Singleton();
	
	//생성자에 private해서 객체 수 제어
	private Singleton(){
		//...
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}