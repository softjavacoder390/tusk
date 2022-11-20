package com.test.java8newfeature.function;

import java.util.function.Function;

public class FuncationExample2 {

	public static void main(String[] args) {
		
		Function<String, Integer> f = i-> i.length();
		
		System.out.println(f.apply("Bharat"));
	}
}
