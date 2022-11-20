package com.test.java8newfeature.consumer;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		
		Consumer<String> c = s-> System.out.println(s);
		c.accept("bharat");
		
	}
}
