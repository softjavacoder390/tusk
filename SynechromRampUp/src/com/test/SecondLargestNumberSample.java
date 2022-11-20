package com.test;

import java.util.Arrays;

public class SecondLargestNumberSample {

	 public static void main(String args[]){
		 int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i < size; i++ ){ // 6
	    	 
	         for(int j = i+1; j<size; j++){ // 6

	            if(array[i]>array[j]){ //63 > 57
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	         
	         System.out.println(array[i]);
	      }
	      System.out.println("Third second largest number is:: "+array[size-2]);
	 }
	 
}
