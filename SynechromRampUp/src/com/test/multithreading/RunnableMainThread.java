package com.test.multithreading;

class MyRunnableThread implements Runnable {

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("child thread : " + i);
		}
	}

}

public class RunnableMainThread {

	public static void main(String[] args) throws InterruptedException {

		MyRunnableThread targetThread = new MyRunnableThread();
		Thread t = new Thread(targetThread);

		t.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("main thread : " + i);
		}
	}

}
