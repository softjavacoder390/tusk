package com.test.multithreading;

class MyThread22 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread ");
			Thread.yield();
		}
	}
}

public class YieldDemo {

	public static void main(String[] args) {
		MyThread22 t = new MyThread22();
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}