package com.test.multithreading.enhancement.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Display{
	ReentrantLock lock = new ReentrantLock();
	public  void wish(String name){
		lock.lock();
		for (int i = 0; i < 3; i++) {
			
			System.out.print(" good morning ");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
			
			
		}
		lock.unlock();
	}
}
class Mythread extends Thread{
	
	Display d;
	String name;
	
	public Mythread(Display d, String name) {
		this.d =d;
		this.name = name;
	}
	
	public void run(){
		d.wish(name);
	}
}
public class ReentrantLockExample {

	public static void main(String[] args) {
		
		Display d = new Display();
		Mythread t1 = new Mythread(d, "dhoni");
		
		Mythread t2 = new Mythread(d, "bharat");	
		t1.start();
		t2.start();
		
	}
}
