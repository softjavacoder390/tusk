package com.test.java8newfeature.lambdaexpression;


//by implementing interface 
interface A2{
	public int squareIt(int num1); 
}


//class B implements A2{
//
//	@Override
//	public int squareIt(int num1) {
//		return num1*num1;
//	}
//	
//	
//}
public class WithoutLamdaExpCase1 {
	
	public static void main(String[] args) {
		
	//	A2 a =  new B();
		A2 a = numx -> numx*numx;
		
		System.out.println(a.squareIt(5));
		System.out.println(a.squareIt(6));
	}

}
