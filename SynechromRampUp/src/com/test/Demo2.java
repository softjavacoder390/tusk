package com.test;

public class Demo2 {
	public static void main(String[] args)
	        throws ClassNotFoundException
	    {
	        // get the Class instance using forName method
	        Class c1 = Class.forName("com.mysql.jdbc.Driver");
	 
	        System.out.print("Class represented by c1: "
	                         + c1.toString());
	    }

}
