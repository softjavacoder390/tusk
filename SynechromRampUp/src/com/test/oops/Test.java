package com.test.oops;

public class Test {
	Test(double d) {
		this(10);
		System.out.println("double-argument constructor");
	}

	Test(int i) {
		this();
		System.out.println("int-argument constructor");
	}

	Test() {
		System.out.println("no-argument constructor");
	}

	public static void main(String[] args) {
		Test t1 = new Test(10.5);// no-argument constructor/intargument
		Test t2 = new Test(10);// no-argument constructor/intargument
		Test t3 = new Test();// no-argument constructor
	}
}