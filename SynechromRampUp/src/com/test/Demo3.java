package com.test;

import java.util.HashSet;

public class Demo3 {

	public static void main(String[] args) {
		
		 HashSet<Integer>objSet = new HashSet<Integer>();

		    for(int i=1;i<=100;i++){
		    	
		    	if(i != 8){
		    		objSet.add(i);
		    	}
		    }
		   for(int i=1;i<=100;i++){
		  
		   if(objSet.contains(i)){
		   }else{
		   System.out.println("missing elemnet is "+i);
		   }


		}
		   
	}
	
}
