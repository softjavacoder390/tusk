package com.test.java8newfeature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfmethodEx {

	public static void main(String[] args) {

		Stream s = Stream.of(9, 99, 999, 9999, 99999);

		s.forEach(System.out::println);

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(4);
		list.add(34);
		list.add(56);
		list.add(50);
		list.add(60);

		System.out.println(list);

		Stream.of(list.stream().toArray(Integer[]::new)).forEach(System.out::println);

		
	}

}
