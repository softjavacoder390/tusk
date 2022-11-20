package com.test.multithreading;

class DisplayE {
   
	//while updation data incosistency problem in multithreading
	public synchronized  void displayNumber( ) {

		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("got intrrupted");
			}
		}
	}
	
	public synchronized void displayChar( ) {
		System.out.println();
		for (int i = 65; i <= 75; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(200);
				
			} catch (InterruptedException e) {
				System.out.println("got intrrupted");
			}
		}
	}
}

class ThreadF extends Thread {
	DisplayE d;

	ThreadF(DisplayE d) {
		this.d = d;

	}

	public void run() {
		d.displayNumber();
	}
}

class ThreadG extends Thread {
	DisplayE d;

	ThreadG(DisplayE d) {
		this.d = d;

	}

	public void run() {
		d.displayChar();
	}
}

public class MethodSynechronizationDemo2 {

	public static void main(String[] args) {

		DisplayE d1 = new DisplayE();
		ThreadF t1 = new ThreadF(d1);
		ThreadG t2 = new ThreadG(d1);
		t1.start();
		t2.start();
	}

}
