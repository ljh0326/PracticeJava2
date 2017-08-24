package ch13;

import javax.swing.*;

public class ThreadEx18 {

	public static void main(String[] args) {
		
		
	}
}

class Thread18 implements Runnable{
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	Thread18(String name){
		th = new Thread(this, name);
	}
	
	public void run() {
		String name = th.getName();
		
		while(!stopped) {
			if(!suspended) {
				System.out.println(name);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println(name + "- interrupted");
				}
			}else {
				Thread.yield();
			}
		}
		System.out.println(name + "- stopped");
	}
	
	public void suspend() {
		suspended = true;
		th.interrupt();
		System.out.println(th.getName() + "-interrupt() by suspend()");
	}
	
	public void stop() {
		stopped = true;
		th.interrupt();
		System.out.println(th.getName() + "- interrupt() by stop()");
	}
	
	public void resume() {
		suspended = false;
	}
	
	public void start() {
		th.start();
	}
}