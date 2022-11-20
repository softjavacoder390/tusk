package com.test.java8newfeature.lambdaexpression;


/*
 Lamda expression always apply on that kind of interface only
 which is having only and only single method interface
 * */

//@FunctionalInterface
interface A4{
	public int squareIt(int num1); 
	public int pluseOne(int num1); 
}

public class WithLamdaExpressionCase1 {
	
	public static void main(String[] args) {
//		A4 a1 = (int numx) -> { return numx*numx;};
//		A4 a2 = (int numx) -> numx*numx;
//		A4 a3 = (numx) -> numx*numx;
//		A4 a4 = numx -> numx*numx;
		//A4 a1 = numx -> numx*numx;
		
	//	System.out.println(a1.squareIt(5));
		System.out.println("aaaa");
	}
	
//	public static void main(String[] args) {
//		
//		A4 a = numx -> numx*numx;  // uncomment and see the reasion
//		
//		
//		System.out.println(a.squareIt(5));
//	}

}
