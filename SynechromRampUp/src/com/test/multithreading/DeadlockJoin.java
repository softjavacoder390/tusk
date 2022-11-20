package com.test.multithreading;

class MyThread2 extends Thread {
 static Thread mt;
	public void run() {
		
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread ");
		}
	}
}

public class DeadlockJoin {

	public static void main(String[] args) throws InterruptedException{
		
		MyThread2 t = new MyThread2();
		MyThread2.mt = Thread.currentThread();
		t.start();
		t.join();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}