package com.test.java8newfeature.predicate;

import java.util.function.Predicate;

public class PredicateExample1 {
	public static void main(String[] args) {
		
		Predicate<Integer> p = i->i%2==0; // multiple condition also allowed
		Predicate<Integer> p1 = i->i>30;
		System.out.println(p.test(30));
		System.out.println(p.and(p1).test(31));
		System.out.println(p.or(p1).test(31));
		System.out.println(p.negate().test(30));
	}

}
