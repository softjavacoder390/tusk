package com.test.java8newfeature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamtoArrayExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(34);
		list.add(56);
		list.add(50);
		list.add(60);
		
		System.out.println(list);
		 
		Integer[] i = list.stream().toArray(Integer[] :: new);
		
		for (Integer integer :i) {
			System.out.println(integer);
		}
	}

}
