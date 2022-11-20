package com.test.java8newfeature.stream;

//to get the longest String
import java.util.*;

class StreamReduceMethod {

	// Driver code
	public static void main(String[] args)
	{
		// creating a list of Strings
		List<String> words = Arrays.asList("GFG", "Geeks", "for",
										"GeeksQuiz", "GeeksforGeeks");

	
		Optional<String> longestString = words.stream()
								.reduce((word1, word2)
							-> word1.length() > word2.length()
										? word1 : word2);

		// Displaying the longest String
		longestString.ifPresent(System.out::println);
	}
}
