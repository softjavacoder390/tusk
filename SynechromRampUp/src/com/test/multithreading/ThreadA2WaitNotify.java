package com.test.multithreading;


class ThreadB1 extends Thread{
	
	int total =0;
	public void run(){
		synchronized (this) {
		for (int i = 0; i <= 100; i++) {
			
			total = total+i;
		}
		
			this.notify();
		}
		
	}
	
}
public class ThreadA2WaitNotify {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB1 t = new ThreadB1();
		
		t.start();
		Thread.sleep(1000);
		synchronized (t) {
			t.wait();	
		}
		
		System.out.println(t.total);
	}
	

}
