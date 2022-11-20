package com.test.java8newfeature.stream;

import java.util.stream.Stream;

public class StreamAllMactch2 {
	 // Driver code
    public static void main(String[] args) {
        
        
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Geeks", "for", 
                           "GeeksQuiz", "GeeksforGeeks");
              
        // Check if all elements of stream
        // have length greater than 2 using
        // Stream allMatch(Predicate predicate)
        boolean answer = stream.allMatch(str -> str.length() > 2);
          
        // Displaying the result
        System.out.println(answer);
}

}
