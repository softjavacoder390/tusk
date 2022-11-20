package com.test;

public class AddElementOFArray {
	
	public static void main(String[] args) {

		int arr[]= {3,1,6}; 
		int k = 6;
		int totalOfArr = 0;
		String s = "";
		for (int i = 0; i < arr.length; i++) 
		  s =  s+arr[i];
		
	    totalOfArr = Integer.parseInt(new StringBuilder().
	    		append(Integer.toString(Integer.parseInt(s)+k)).reverse().toString());
		int last;
		int count = 0;
		while(totalOfArr>0)   
		{   
		last = totalOfArr % 10;   
		totalOfArr = totalOfArr/10;  
		arr[count++] = last; 
		System.out.print(last);
		}  
		
		
	}

}
