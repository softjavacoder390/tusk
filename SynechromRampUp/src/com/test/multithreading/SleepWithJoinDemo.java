package com.test.multithreading;

class MyThread6 extends Thread {
	public void run() {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class SleepWithJoinDemo {

	public static void main(String[] args) throws InterruptedException{
		
		MyThread6 t = new MyThread6();
		t.start();
		t.join();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}