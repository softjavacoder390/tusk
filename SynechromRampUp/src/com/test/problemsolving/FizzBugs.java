package com.test.problemsolving;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBugs {
	public static List<String> fizzBuzz(int start, int end, Map<Integer, String> map) {
	    return IntStream.rangeClosed(start, end).mapToObj(i -> {
	        String result = map.entrySet().stream()
	                .filter(v -> i % v.getKey() == 0)
	                .map(Entry::getValue)
	                .reduce("", (left, right) -> left + right);
	        return result.matches("\\p{IsWhite_Space}*") ? String.valueOf(i) : result;
	    }).collect(Collectors.toList());
	}

	public static void main(String[] args) {
	    Map<Integer, String> map = new HashMap<>();
	    map.put(2, "Two");
	    map.put(3, "Fizz");
	    map.put(5, "Buzz");
	    map.put(7, "Temp");

	    fizzBuzz(1, 106, map).forEach(System.out::println);
	}
}