package com.test.multithreading;

public class SleepDemoSlideRotator {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("Slide = "+i);
			Thread.sleep(1000);
		}
		
	}
}
