package com.test.java8newfeature.stream;

import java.util.Arrays;
import java.util.List;

public class StreamNoneMactch1 {
	 // Driver code
    public static void main(String[] args) {
        
    	 // Creating a list of Integers using asList() of
        // Arrays class by declaring object of List
        List<Integer> list = Arrays.asList(4, 0, 6, 2);
  
        // Using Stream noneMatch(Predicate predicate) and
        // storing the boolean value
        boolean answer
            = list.stream().noneMatch(num -> num < 0);
  
        // Printing and displaying the above boolean value
        System.out.println(answer);
}

}
