package ch13;

public class ThreadEx12 {

	public static void main(String[] args) {
		Thread12 t1 = new Thread12();
		Thread12_2 t2 = new Thread12_2();
		t1.start();
		t2.start();
		
		try {
			t1.sleep(2000);
		}catch(InterruptedException e) {
			
		}
	}
}

class Thread12 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println("<<th1 종료>>");
		
		System.out.println("<<main종료");
	}
}

class Thread12_2 extends Thread{
	public void run() {
		for (int i  =0; i < 300; i++)
			System.out.print("|");
		
		System.out.println("<<th2 종료");
	}
}