package ch13;

public class ThreadEx5 {
	static long startTime = 0;

	public static void main(String[] args) {
		ThEx5 t1 = new ThEx5();
		t1.start();
		startTime = (System.currentTimeMillis() - ThreadEx5.startTime);
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.println("소유시간" + (System.currentTimeMillis()-ThreadEx5.startTime));
	}
}

class ThEx5 extends Thread{
	public void run() {
		for (int i = 0; i < 300; i++){
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println(System.currentTimeMillis() - ThreadEx5.startTime);
	}
}