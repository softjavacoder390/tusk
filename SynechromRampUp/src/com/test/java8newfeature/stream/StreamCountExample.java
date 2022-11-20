package com.test.java8newfeature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCountExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(60);
		list.add(30);
		list.add(20);
		list.add(10);
		
		System.out.println(list);
		 
	  //  Stream s = list.stream();
		int min = list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println(min);
		int max = list.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println(max);
		
		int min1 = list.stream().min((i1,i2)-> -i1.compareTo(i2)).get();
		System.out.println(min1);
		int max2 = list.stream().max((i1,i2)-> -i1.compareTo(i2)).get();
		System.out.println(max2);
	}

}
