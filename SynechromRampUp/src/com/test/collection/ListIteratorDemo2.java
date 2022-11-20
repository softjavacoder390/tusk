package com.test.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo2 {
	public static void main(String[] args) {

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(2);
		aList.add(3);
		aList.add(40);
		aList.add(5);
		
		System.out.println(aList.get(0));

		System.out.println("Elements of ArrayList: ");
		for (Integer i : aList) {
			System.out.println(i);
		}
		ListIterator<Integer> l = aList.listIterator();
		System.err.println(l.previousIndex());
		System.err.println(l.nextIndex());
		
		l.next();
		l.set(80000);
		
		System.err.println(l.nextIndex());
		System.err.println(l.previousIndex());

		System.out.println("\nNow the ArrayList" + " elements are: ");
		for (Integer i : aList) {
			System.out.println(i);
		}
	}
}
