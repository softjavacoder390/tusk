package com.test.multithreading;


public class DeadlockByMainThread {

	public static void main(String[] args) throws InterruptedException{
		
		
	 Thread.currentThread().join();
		
	}
}