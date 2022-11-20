package com.test.java8newfeature.lambdaexpression;


//advantage - to bring benefits of funcation programing into java

/*
 what is lamda exression 
 ans
 (1) its ananymous function means nameless
 (2)withount return type
 (3)without modifier
 
 Lamda expression always apply on that kind of interface only
 which is having only and only single method interface
 * */

//@FunctionalInterface
interface A1{
	public int squareIt(int num1); 
}

public class WithLamdaExpression {
	
	public static void main(String[] args) {
		A1 a1 = (int numx) -> { return numx*numx;};
		A1 a2 = (int numx) -> numx*numx;
		A1 a3 = (numx) -> numx*numx;
		A1 a4 = numx -> numx*numx;
		
		System.out.println(a4.squareIt(5));
	}

}
