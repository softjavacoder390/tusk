package com.test.multithreading.enhancement.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

//parent threadlocal value not available to child thread 
class ParentThread7 extends Thread{
	
	 static InheritableThreadLocal tl = new InheritableThreadLocal();
	
	public void run(){
		tl.set("pp");
		System.out.println("parent value.. "+tl.get());
		ChildThread2 ct = new ChildThread2();
		ct.start();
	}
	
}

class ChildThread2 extends Thread{
	
	public void run(){
	
		System.out.println("child value.. "+ParentThread7.tl.get());
		
	}
	
}
public class ThreadLocalDemo7 {
	public static void main(String[] args) {
	
		ParentThread7 c1 = new ParentThread7();
		
		c1.start();
		
	}

}
