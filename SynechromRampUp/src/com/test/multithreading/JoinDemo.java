package com.test.multithreading;

class MyThread55 extends Thread {
	public void run() {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : child thread ");
			
		}
		
		
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException{
		
		MyThread55 t = new MyThread55();
		MyThread55 t1 = new MyThread55();
		MyThread55 t2 = new MyThread55();
		t.start();
		t1.start();
		t.join();
		t1.join();
		t2.start();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}