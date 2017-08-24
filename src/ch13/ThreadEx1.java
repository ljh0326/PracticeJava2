package ch13;

public class ThreadEx1 {

	public static void main(String[] args) {
		thEx2 t1 = new thEx2();
		
		t1.start();
	}
}

class thEx2 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}