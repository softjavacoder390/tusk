package com.test.java8newfeature.predicate;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		
		String[]  s= {"bharat","sharad ji","haris","chand"};
		Predicate<String> p = s1-> s1.length() > 5; // multiple condition also allowed
		
		for (String string : s) {
			if(p.test(string)){
			System.out.println(string);
			}
		}
		
	}

}
