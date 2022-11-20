package com.test.java8newfeature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedExample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(33);
		list.add(34);
		list.add(56);
		list.add(50);
		list.add(60);

		System.out.println(list);

		List<Integer> l1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		List<Integer> l2 = list.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(l2);
		List<Integer> l3 = list.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l3);
		List<Integer> l4 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l4);
	}

}
