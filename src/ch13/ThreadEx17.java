package ch13;

import javax.swing.*;

public class ThreadEx17 {

	public static void main(String[] args) {
		ThEx17 t1 = new ThEx17("*");
		ThEx17 t2 = new ThEx17("**");
		ThEx17 t3 = new ThEx17("***");
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(2000);
			t1.suspend();
			Thread.sleep(2000);
			t2.suspend();
			Thread.sleep(3000);
			t1.resume();
			Thread.sleep(3000);
			t1.stop();
			t2.stop();
			Thread.sleep(2000);
			t3.stop();
		}catch(InterruptedException e) {
			
		}
	}
}

class ThEx17 implements Runnable{
	volatile boolean suspended = false;  //일시정지
	volatile boolean stopped   = false;  //스탑
	
	Thread th;
	
	ThEx17(String name){
		th = new Thread(this, name);
	}
	@Override
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
			}
		}
		System.out.println(Thread.currentThread().getName() + "- stopped");
	}
	
	public void suspend() {
		suspended = true;
	}
	
	public void resume() {
		suspended = false;
	}
	
	public void stop() {
		stopped = true;
		//깨우는 코드(intrupted)를 넣어야 응답성이 좋아짐 
	}
	
	public void start() {
		th.start();
	}
}
