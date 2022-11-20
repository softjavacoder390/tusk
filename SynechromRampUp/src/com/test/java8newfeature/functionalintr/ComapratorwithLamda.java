package com.test.java8newfeature.functionalintr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;


public class ComapratorwithLamda {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(78);
		list.add(37);
		list.add(10);
		list.add(40);
		System.out.println(list);
		
		//Comparator<Integer> c = (o1,o2)->((o1 < o2)?-1:(o1 < o2)?+1:0);
		
		Collections.sort(list, (o1,o2)->((o1 < o2)?-1:(o1 < o2)?+1:0));
		System.out.println(list);
		
	    list.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);	
	
	}

}
