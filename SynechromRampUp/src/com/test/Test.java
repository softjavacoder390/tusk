package com.test;

//Java program to find the length of the
//longest substring without repeating
//characters
import java.io.*;
import java.util.*;

public class Test {

	public static void getMaxElement(int arr2[]) {
		int max = 0;
		int secondMax = 0;

			for (int i = 0; i < (arr2.length)-1 ;i++) {
					max = arr2[i];
					if (max < arr2[i + 1]){ //23<7
						secondMax = max;
					    max = arr2[i+1]; // 22
					}else 
						if(secondMax < max)
							secondMax = max; // 23
			}
			
		System.out.println(secondMax);	
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 12, 18, 22, 9, 23, 7 };

		getMaxElement(arr1);

		// output =5,12,18,22,22,23,23

	}
}