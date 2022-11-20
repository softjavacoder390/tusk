package com.test.multithreading.enhancement.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

class CustomerThread4 extends Thread{
	
	static AtomicInteger custId = new AtomicInteger(0);
	private static ThreadLocal tl = new ThreadLocal(){
		protected Integer initialValue(){
			return custId.incrementAndGet();
		}
	};
	public CustomerThread4(String name) {

		super(name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"..executing with customer id  "+tl.get());
	}
	
}
public class ThreadLocalDemo4 {
	public static void main(String[] args) {
	
		CustomerThread4 c1 = new CustomerThread4("customer thread-1");
		CustomerThread4 c2 = new CustomerThread4("customer thread-2");
		CustomerThread4 c3 = new CustomerThread4("customer thread-3");
		CustomerThread4 c4 = new CustomerThread4("customer thread-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
	}

}
