package com.test;

class A {

	private final void add() {
		System.out.println("1");
	}

}

class B extends A

{

	public void add() {
		System.out.println("2");

	}

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		// a.add();
		System.out.println();
	}
}
