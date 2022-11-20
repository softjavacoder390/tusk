package com.test.java8newfeature.staticmethodintr;

interface Interf{
	
	//public static final int newFiled =10; // getters and setters is not allowed for interface
	
	public static void m1(){
		System.out.println("static m1 () called");
	}
	
}

public class CallingStaticMethod implements Interf {
	
	
	
	public static void main(String[] args) {
		  
		Interf.m1();
		//m1();n // invalid
		//CallingStaticMethod.m1(); // invalid
		CallingStaticMethod t = new CallingStaticMethod(); //
		//t.m1();  //invalid
		Interf t1 = new CallingStaticMethod();
		//t1.m1();
		
	}

}
