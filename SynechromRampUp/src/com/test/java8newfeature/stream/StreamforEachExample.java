package com.test.java8newfeature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamforEachExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(34);
		list.add(56);
		list.add(50);
		list.add(60);
		
		System.out.println(list);
		 
	  //  Stream s = list.stream();
		Consumer<Integer> c =i->{
			System.out.println("The Square if "+i+" is : "+(i*i));
		};
		
		list.stream().forEach(c);
	}

}
