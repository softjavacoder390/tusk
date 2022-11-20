package com.test;

@FunctionalInterface
public interface FunIntrDemo {

	public void m1();
//	public void m5();
	default void m2(){}
	default void m3(){}
	static void m4(){}
	
}
