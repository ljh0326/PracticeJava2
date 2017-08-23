package ch7;

public class Operator14 {	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
	}
}

final class Singleton{
	
	static Singleton s = new Singleton();
	
	//�����ڿ� private�ؼ� ��ü �� ����
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