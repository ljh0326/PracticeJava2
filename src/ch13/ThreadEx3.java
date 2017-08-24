package ch13;

public class ThreadEx3 {

	public static void main(String[] args) {
		ThEx3 t1 = new ThEx3();
		t1.start();
	}
}

class ThEx3 extends Thread{
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}