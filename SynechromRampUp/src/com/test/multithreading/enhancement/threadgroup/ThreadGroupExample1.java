package com.test.multithreading.enhancement.threadgroup;

public class ThreadGroupExample1 {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());  // main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //system
	}

}
