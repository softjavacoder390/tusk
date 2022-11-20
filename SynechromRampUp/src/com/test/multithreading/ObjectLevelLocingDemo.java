package com.test.multithreading;

class DisplayB {

	public synchronized void wish(String name) {

		for (int i = 0; i < 10; i++) {
			System.out.print("Goodmoring : ");
			try {
				Thread.sleep(2000);
				System.out.println(name);
			} catch (InterruptedException e) {
				System.out.println("got intrrupted");
			}
		}
	}
}

class ThreadD extends Thread {
	DisplayB d;
	String name;

	ThreadD(DisplayB d, String name) {
		this.d = d;
		this.name = name;

	}

	public void run() {
		d.wish(name);
	}
}

public class ObjectLevelLocingDemo {

	public static void main(String[] args) {

		DisplayB d1 = new DisplayB();
		DisplayB d2 = new DisplayB();
		ThreadD t1 = new ThreadD(d1, "dhoni");
		ThreadD t2 = new ThreadD(d2, "yuvraj");
		t1.start();
		t2.start();
	}

}
