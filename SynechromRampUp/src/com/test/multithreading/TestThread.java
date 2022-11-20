package com.test.multithreading;

class MyThread1 extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("child thread : "+ i);
		}
	}

}

public class TestThread {

	public static void main(String[] args) throws InterruptedException {

		MyThread1 t = new MyThread1();

		t.start();
		
		
		for (int i = 0; i < 10; i++) {

			System.out.println("main thread : "+i);
		}
	
	}
}