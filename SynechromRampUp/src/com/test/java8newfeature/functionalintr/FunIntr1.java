package com.test.java8newfeature.functionalintr;

//only and one public abstract is allowed if we write @functionalInterface annotation.
@FunctionalInterface
public interface FunIntr1 {
	
	public void m1();
	//public void m2();
	default void m3(){}
	static void m4(){}
	

}
