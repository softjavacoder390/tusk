package com.test.designpattern.creational.factory;

public class ObjectGenerationFactor {

	public static OperatingSystem getOperationSystem(String OSName) {

		if ("" != OSName && OSName != null) {

			if ("Android".equalsIgnoreCase(OSName)) {
				return new AndroidOS();
			} else if ("Mac".equalsIgnoreCase(OSName)) {
				return new MacOS();
			} else if ("Mac".equalsIgnoreCase(OSName)) {
				return new WindowsOS();
			} else System.out.println("os not matched");

		}
		else {
			System.out.println("Objection Creation Failed");
			return null;
		}

		return null;
	}

}
