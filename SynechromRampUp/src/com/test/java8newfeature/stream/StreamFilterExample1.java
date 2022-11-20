package com.test.java8newfeature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(33);
		list.add(34);
		list.add(56);
		list.add(50);
		list.add(60);
		
		System.out.println(list);
		 
	  //  Stream s = list.stream();
		List<Integer> l = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
	}

}
