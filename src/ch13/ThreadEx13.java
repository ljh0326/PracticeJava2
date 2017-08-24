package ch13;

import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args) {
		Thread13 t1 = new Thread13();
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력하신 값은" + input + "입니다.");
		t1.interrupt();
		System.out.println("isInterrupted() : "+ t1.isInterrupted());
		
	}
}

class Thread13 extends Thread{
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x = 0; x <2500000000L; x++);
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}