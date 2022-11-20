
package com.test.multithreading;

class MyThread8 extends Thread {
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

public class JoinWithReverseCall {

	public static void main(String[] args) throws InterruptedException{
		
		MyThread8 t = new MyThread8();
		MyThread8.mt = Thread.currentThread();
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}