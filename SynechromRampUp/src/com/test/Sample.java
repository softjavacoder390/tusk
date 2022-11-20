// Java program to find the least frequent element
// in an array.
package com.test;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Sample {
	
	static void regEx() {
		String repeatCharsRegEx = "(\\w)\\1+";
		Pattern repeatCharsPattern = Pattern.compile(repeatCharsRegEx);
		Matcher matcher = repeatCharsPattern.matcher("aasdfasdfddddaaaadfdggggasdf");
		while( matcher.find() ) {
		System.out.println(matcher.group() +" len : "+(matcher.end() - matcher.start()));
		}
	
}
	
	public static void main(String args[])
	{
		//regEx();
		
	
		        String[] words = new String[10];  
		        Optional<String> checkNull = 
		                      Optional.ofNullable(words[5]);  
		        System.out.println(checkNull.isPresent());
		        if (checkNull.isPresent()) {  
		            String word = words[5].toLowerCase();  
		            System.out.print(word);  
		        } else  
		            System.out.println("word is null");  
		     
		
}

}
