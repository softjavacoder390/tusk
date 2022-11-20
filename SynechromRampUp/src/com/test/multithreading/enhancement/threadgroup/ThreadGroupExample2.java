package com.test.multithreading.enhancement.threadgroup;

public class ThreadGroupExample2 {
	
	public static void main(String[] args) {
		
		ThreadGroup g1 = new ThreadGroup("firstThreadGroup"); //new group
		System.out.println(g1.getParent().getName());  // main

		ThreadGroup g2 = new ThreadGroup(g1,"secondThreadGroup"); //sub group group
		System.out.println(g2.getParent().getName());  // main
		
	}

}
