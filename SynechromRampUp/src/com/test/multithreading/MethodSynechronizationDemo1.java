package com.test.multithreading;

class Display {
   
	//while updation data incosistency problem in multithreading
	public static  void wish(String name) {

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

class Threadc extends Thread {
	Display d;
	String name;

	Threadc(Display d, String name) {
		this.d = d;
		this.name = name;

	}

	public void run() {
		d.wish(name);
	}
}

public class MethodSynechronizationDemo1 {

	public static void main(String[] args) {

		Display d1 = new Display();
		Display d2 = new Display();
		Threadc t1 = new Threadc(d1, "dhoni");
		Threadc t2 = new Threadc(d2, "yuvraj");
		t1.start();
		t2.start();
	}

}
