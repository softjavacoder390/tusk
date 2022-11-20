package com.test.java8newfeature.functionalintr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1 < o2) return -1;
		else if (o1 > o2) return +1;
		else return 0;
		
	}
	
}

public class ComapratorwithoutLamda {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(40);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		
	}

}
