package com.test;

public abstract class Test111 {

	public static void main(String[] args) {
		 // Input string 1
		 // Input strings
        String s = "Geeks", g = "";
 
        // Using concat() method over strings
      //  String f = "geek".concat("c");
        String f = s.concat(g);

        // Checking if both strings are equal
 
        // Case 1
        System.out.println("f "+ f.length() +"s :"+s.length());
        System.out.println(f == s);
        System.out.println(s.equals(f));
        if (f == s)
 
            // Identical strings
            System.out.println("Both are same");
 
        else
 
            // Non-identical strings
            System.out.println("not same");
 
        // Case 2
        String e = s + g;
 
        // Again checking if both strings are equal
        if (e == s)
 
            // Identical strings
            System.out.println("Both are same");
        else
 
            // Non-identical strings
            System.out.println("not same");
	}
}
