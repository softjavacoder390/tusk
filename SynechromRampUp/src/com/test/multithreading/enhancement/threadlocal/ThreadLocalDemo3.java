package com.test.multithreading.enhancement.threadlocal;


class CustomerThread extends Thread{
	
	static Integer custId = 0;
	private  static ThreadLocal tl = new ThreadLocal(){
		protected Integer initialValue(){
			return ++custId;
		}
	};
	public CustomerThread(String name) {

		super(name);
	}
	public void run(){
		
		
		System.out.println(Thread.currentThread().getName()+"..executing with customer id  "+tl.get());
		
	}
	
}
public class ThreadLocalDemo3 {
	public static void main(String[] args) {
	
		CustomerThread c1 = new CustomerThread("customer thread-1");
		CustomerThread c2 = new CustomerThread("customer thread-2");
		CustomerThread c3 = new CustomerThread("customer thread-3");
		CustomerThread c4 = new CustomerThread("customer thread-4");
		
		c1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c2.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c3.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c4.start();
		
	}

}
