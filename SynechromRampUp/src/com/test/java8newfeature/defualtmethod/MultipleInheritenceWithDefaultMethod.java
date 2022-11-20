package com.test.java8newfeature.defualtmethod;


interface Left{
	default void m1(){
		System.out.println("left m1() called");
	}
}

interface Right{
	default void m1(){
		System.out.println("right m1() called");
	}
}

public class MultipleInheritenceWithDefaultMethod implements Left,Right{
	
	public void m2(){
		System.out.println("main m2() called");
		Left.super.m1();
		//Right.super.m1();
	}
	
	public void m1(){
		System.out.println("main m1() called");
		Left.super.m1();
		//Right.super.m1();
	}
	
	public static void main(String[] args) {
		MultipleInheritenceWithDefaultMethod t = 
				new MultipleInheritenceWithDefaultMethod();
	//	t.m1();
	//	t.m2();
	
	}
}
