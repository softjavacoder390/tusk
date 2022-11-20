package com.test.multithreading.enhancement.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

//parent threadlocal value not available to child thread 
class ParentThread6 extends Thread{
	
	 static InheritableThreadLocal tl = new InheritableThreadLocal(){
		 public Object childValue(Object pvalue){
			 return "cc";
		 }
	 };
	
	
	public void run(){
		tl.set("pp");
		System.out.println("parent value.. "+tl.get());
		ChildThread1 ct = new ChildThread1();
		ct.start();
	}
	
}

class ChildThread1 extends Thread{
	
	public void run(){
	
		System.out.println("child value.. "+ParentThread6.tl.get());
		
	}
	
}
public class ThreadLocalDemo6 {
	public static void main(String[] args) {
	
		ParentThread6 c1 = new ParentThread6();
		
		c1.start();
		
	}

}
