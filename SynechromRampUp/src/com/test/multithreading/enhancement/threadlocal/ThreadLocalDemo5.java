package com.test.multithreading.enhancement.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

//parent threadlocal value not available to child thread 
class ParentThread5 extends Thread{
	
	 static ThreadLocal tl = new ThreadLocal();
	

		public ParentThread5( ) {

		}
	
	public ParentThread5(String name) {

		super(name);
	}
	public void run(){
		tl.set("pp");
		System.out.println("parent value.. "+tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
	
}

class ChildThread extends ParentThread5{
	
	public void run(){
	
		System.out.println("child value.. "+ParentThread5.tl.get());
		
	}
	
}
public class ThreadLocalDemo5 {
	public static void main(String[] args) {
	
		ParentThread5 c1 = new ParentThread5("customer thread-1");
		
		c1.start();
		
	}

}
