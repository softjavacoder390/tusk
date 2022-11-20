package com.test.multithreading;

class MyThread10 extends Thread{
	
	public void run(){
		System.out.println("MyThread9.run()");
	}
}
public class DeamonThreadDemo {
	
public static void main(String[] args) {
	
	System.out.println(Thread.currentThread().isDaemon()); // false
	
	//Thread.currentThread().setDaemon(true); //java.lang.IllegalThreadStateException
	MyThread10 t = new MyThread10();
   System.out.println(t.isDaemon()); // false
   
   t.setDaemon(true);
   System.out.println(t.isDaemon()); //true
	
}	

}
