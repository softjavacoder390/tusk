package com.test.designpattern.creational.builder;

public class Phone {
	
	private int battery;
	private int ram;
	private String os;
	private String processor;
	private double screanSize;
	
	
	public Phone(int battery, int ram, String os, String processor, double screanSize) {
		super();
		this.battery = battery;
		this.ram = ram;
		this.os = os;
		this.processor = processor;
		this.screanSize = screanSize;
	}
	
	
	@Override
	public String toString() {
		return "Phone [battery=" + battery + ", ram=" + ram + ", os=" + os + ", processor=" + processor
				+ ", screanSize=" + screanSize + "]";
	}


	
	

}
