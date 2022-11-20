package com.test.java8newfeature.function;

import java.util.function.Function;

public class FuncationExample1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = i-> i*i;
		Function<Integer, Boolean> f2 = i-> i%2==0;
		
		System.out.println(f1.apply(6));
		System.out.println(f2.apply(6));
	}
}
