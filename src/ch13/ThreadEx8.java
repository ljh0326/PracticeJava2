package ch13;

import javax.swing.JOptionPane;

public class ThreadEx8 {

	public static void main(String[] args) {
		ThEx8 t1 = new ThEx8();
		ThEx8_2 t2 = new ThEx8_2();
		
		t2.setPriority(7);
		
		t1.start();
		t2.start();
	}
}

class ThEx8 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
			for(int x = 0; x < 10000000; x++);
		}
	}
}

class ThEx8_2 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.println("|");
			for(int x=0; x < 10000000; x++);
		}
	}
}