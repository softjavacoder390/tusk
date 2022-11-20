package com.test.java8newfeature.functionalintr;

interface A {
	public int add(int a, int b);
	//public int add1(int a, int b);  //uncoment and check errors
}

public class LamdaWithFunctinalInterface {

	public static void main(String[] args) {

		A a1 = (a,b) -> {
			System.out.println("plus of two number is "+ (a + b));
		    return a+b;
		};

		int k = a1.add(144, 20);
		
		System.out.println("outside "+k);
	}
}