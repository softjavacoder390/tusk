package com.test.java8newfeature.supplier;

import java.util.function.Supplier;

//math.random() *10
//0 <= x < 1 
//max 0.999999
//minimum 0
public class OTPGenerateUsingSupplier {

	public static void main(String[] args) {
		
		Supplier<String> s = ()-> {
			String otp ="";
			for (int i = 0; i < 6; i++) {
			
			otp = otp + (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
	}
	
}
