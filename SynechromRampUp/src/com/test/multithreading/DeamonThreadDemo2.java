package com.test.multithreading;

class MyThread11 extends Thread{
	
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.print("child thread");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("got intrrupted");
			}
		}
	}
}
public class DeamonThreadDemo2 {
	
public static void main(String[] args) {
	MyThread11 t = new MyThread11();
   t.setDaemon(true);
   t.start();
   System.out.println("main thread");
	
}	

}
