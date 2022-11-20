package com.test.java8newfeature.lambdaexpression;

//using annonimious classes
interface A3 {
	public int squareIt(int num1);

	public int plusOne(int num1);
}

public class WithoutLamdaExpCase2 {

	public static void main(String[] args) {

		A3 a3 = new A3() {
			@Override
			public int squareIt(int num1) {
				return num1 * num1;
			}
            
			@Override
			public int plusOne(int num1) {
				return ++num1;
			}
		};

		System.out.println(a3.squareIt(5));
		System.out.println(a3.plusOne(7));
	}

}
