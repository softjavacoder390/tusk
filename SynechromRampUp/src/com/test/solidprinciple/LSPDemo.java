package com.test.solidprinciple;

//liskov substitution principle
//objects of super class shall be replace with  objects subclasses

class Vehicle {

	public void start() {

		System.out.println("vihcle is running...");
	}

	public void stop() {

		System.out.println("vihcle is stoping...");
	}

}

class Bike extends Vehicle {

	public void start() {

		System.out.println("Bike is running...");
	}

	public void stop() {

		System.out.println("Bike is stoping...");
	}
}

class Car extends Vehicle {

	public void start() {

		System.out.println("Car is running...");
		//throw new RuntimeException(); // it was not intended
	}

	public void stop() {

		System.out.println("Car is stoping...");
	}

}

public class LSPDemo {
	
	public static void testDrive(Vehicle v){
		v.start();
		v.stop();
		
	}

	public static void main(String[] args) {
		
		testDrive(new Vehicle());
		testDrive(new Bike());
		testDrive(new Car());
		

	}

}
