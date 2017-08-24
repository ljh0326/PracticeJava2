package ch13;

public class ThreadEx2 {

	public static void main(String[] args) {
		Th t1 = new Th();
		Runnable r = new Th2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();

	}

}

class Th extends Thread{
	public void 
	run() {
		for(int i = 0 ; i < 5; i++) {
			System.out.println(getName());
		}
	}
}

class Th2 implements Runnable{
	public void run() {
		for(int i = 0; i < 5; i++)
			System.out.println(Thread.currentThread().getName());
	}
}