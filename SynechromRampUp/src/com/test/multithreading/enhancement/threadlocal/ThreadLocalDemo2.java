package com.test.multithreading.enhancement.threadlocal;

public class ThreadLocalDemo2 {
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal();
		
		System.out.println(tl.get());
		tl.set("bharat");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
