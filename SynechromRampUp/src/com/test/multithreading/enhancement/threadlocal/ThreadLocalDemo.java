package com.test.multithreading.enhancement.threadlocal;

public class ThreadLocalDemo {
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal(){
			public Object initialValue(){
				return "abc";
			}
		};
		
		System.out.println(tl.get());
		tl.set("bharat");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
