package com.test.oops;

class A {
	final int x = 10;
}

class B extends A {
	// int x = 20;
}

public class C extends B {
	//int x = 30;

	public static void main(String[] args) {
		C c = new C();
        System.out.println("C.main()");
		System.out.println("C.main() " + c.x);
	}
}