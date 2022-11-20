package com.test.solidprinciple;

//Interface Segregation Principle

//A Client should never be forced to implement an interface that it does not use.

interface VegRestaurants {

	public void vegMeals();

}

interface NonVegRestaurants {

	public void nonVegMeals();

}

class ABCVegRestaurant implements VegRestaurants {

	@Override
	public void vegMeals() {
		System.out.println("provide veg meals");

	}

}

class XYZVegRestaurant implements VegRestaurants, NonVegRestaurants {

	@Override
	public void vegMeals() {
		System.out.println("provide veg meals");

	}

	@Override
	public void nonVegMeals() {
		System.out.println("provide veg meals");

	}

}

public class ISPDemo {
	public static void main(String[] args) {

		
	}
}
