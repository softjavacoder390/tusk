package com.test.java8newfeature.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample1 {

	public static void main(String[] args) 
    {
		
		List <Integer> list = Arrays.asList(9,5,3,2,0,4,8,2,6,3,7,1);
		Integer[] tt =(Integer[])list.toArray();
		
		
		
		for (Integer integer : tt) {
			System.out.println(integer);
		}
		Stream <Integer> even = list.stream().filter(e -> e%2==0).sorted();
		Stream <Integer> odd = list.stream().filter(e -> e%2!=0).sorted(Comparator.reverseOrder());
		List <Integer> mylist = Stream.concat(even, odd).collect(Collectors.toList());
		System.out.println(mylist);
		
//        List<Integer> list1 = Arrays.asList(1,2,3);
//        List<Integer> list2 = Arrays.asList(4,5,6);
//        List<Integer> list3 = Arrays.asList(7,8,9);
//        List<Integer> list4 = Arrays.asList(7,8,9);
//          
//        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3,list4);
//         
//        List<Integer> listOfAllIntegers = listOfLists.stream()
//                            .flatMap(x -> x.stream())
//                            .collect(Collectors.toList());
//  
//        System.out.println(listOfAllIntegers);
    }
	
}
