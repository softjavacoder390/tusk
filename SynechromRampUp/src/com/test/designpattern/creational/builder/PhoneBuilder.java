package com.test.designpattern.creational.builder;

public class PhoneBuilder {
	
	private int battery;
	private int ram;
	private String os;
	private String processor;
	private double screanSize;
	
	
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreanSize(double screanSize) {
		this.screanSize = screanSize;
		return this;
	}
	
	public Phone getPhone(){
		
		return new Phone(battery, ram, os, processor, screanSize);
	}
	
	
}
