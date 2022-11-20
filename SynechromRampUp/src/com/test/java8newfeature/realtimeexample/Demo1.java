package com.test.java8newfeature.realtimeexample;


interface A{
	public void add(int num1, int num2); 
}

public class Demo1 {
	
	public static void main(String[] args) {
		
		A a = (a1,b1) -> System.out.println(a1+b1);
		a.add(2, 2);
	}

}
