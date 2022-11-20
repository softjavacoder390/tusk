package com.test.java8newfeature.function;

import java.util.function.Function;

public class FuncationExample3 {

	public static void main(String[] args) {
		
		Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("mkyong");   // 12\
        
        //Integer result = func.compose(func2).apply("mkyong");   // 12

        System.out.println(result);
		
	}
}
