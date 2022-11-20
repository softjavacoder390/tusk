package com.test.designpattern.creational.builder;

public class Shop {
	
	public static void main(String[] args) {
		
		Phone phone = new PhoneBuilder().setOs("adndroid").setRam(12).setBattery(5000).getPhone();
		
		System.out.println(phone);
	}

}
