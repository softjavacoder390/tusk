
package com.test.multithreading;

class MyThread9 extends Thread {
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread ");

				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("got intrrupted");
		}
	}

}

public class SleepThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {

		MyThread9 t = new MyThread9();
		t.start();

		t.interrupted();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}