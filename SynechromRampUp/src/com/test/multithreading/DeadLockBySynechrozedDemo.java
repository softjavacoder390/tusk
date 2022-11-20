package com.test.multithreading;

class ACall {

	public synchronized void d1(BCall b) {

		System.out.println("thread 1 starts execution of d1() method");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread 1 trying to call b.last()");
		b.last();

	}

	public synchronized void last() {

		System.out.println("inside ACall, this is last() method");
	}

}

class BCall {

	public synchronized void d2(ACall a) {

		System.out.println("thread 2 starts execution of d2() method");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread 2 trying to call a.last()");
		a.last();

	}

	public synchronized void last() { // if we remove any one of synchronized then it wont enter into the deadlock condition

		System.out.println("inside BCall, this is last() method");
	}

}

public class DeadLockBySynechrozedDemo extends Thread {
	
	ACall a = new ACall();
	BCall b = new BCall();
	
	public void m1(){
		
		this.start();
		a.d1(b); //this line executed by main thread
	}
	
	public void run(){
		
		b.d2(a);//this line executed by child thread
	}
	
	public static void main(String[] args) {
		DeadLockBySynechrozedDemo t = new DeadLockBySynechrozedDemo();
		t.m1();
		
	}
	
}
