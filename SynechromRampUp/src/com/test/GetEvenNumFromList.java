package com.test;

import java.util.Arrays;
import java.util.List;

/*
[15:37] Sushant Sharma
list=1,2,3,4,5,6,7,8,9

[15:38] Sushant Sharma
first op = 2,4,6,8

[15:38] Sushant Sharma
sec op =2,4,8,10,....
*/
public class GetEvenNumFromList {
	
	public static void main(String[] args) {
		
		int[] numbers = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
            		
		Arrays.stream(numbers).filter(o -> o % 2 == 0).
                                    forEach(System.out::println);
        Arrays.stream(numbers).map(o -> o*2).forEach(System.out::println);
        
        
	    }
	

}
