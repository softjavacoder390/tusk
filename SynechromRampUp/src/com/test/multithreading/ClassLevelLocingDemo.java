package com.test.multithreading;

class DisplayD {

	public static synchronized void wish(String name) {

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

class ThreadE extends Thread {
	DisplayD d;
	String name;

	ThreadE(DisplayD d, String name) {
		this.d = d;
		this.name = name;

	}

	public void run() {
		d.wish(name);
	}
}

public class ClassLevelLocingDemo {

	public static void main(String[] args) {

		DisplayD d1 = new DisplayD();
		DisplayD d2 = new DisplayD();
		ThreadE t1 = new ThreadE(d1, "dhoni");
		ThreadE t2 = new ThreadE(d2, "yuvraj");
		t1.start();
		t2.start();
	}

}
