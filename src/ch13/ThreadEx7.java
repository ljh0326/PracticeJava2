package ch13;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
		ThEx7 t1 = new ThEx7();
		t1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է�");
		System.out.println(input + "�Դϴ�.");
		}
}

class ThEx7 extends Thread{
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
