package com.test.designpattern.structural.facade;

import java.sql.Driver;

 class Firefox {

	public static Driver getFirefoxDriver() {

		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {

		System.out.println("Generating HTML report for Firefox...");

	}

	public static void generateJUnitReport(String test, Driver driver) {

		System.out.println("Generating JUnit report for Firefox...");

	}

}

 class Chrome {

	public static Driver getChromeDriver() {

		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {

		System.out.println("Generating HTML report for Chrome...");

	}

	public static void generateJUnitReport(String test, Driver driver) {

		System.out.println("Generating JUnit report for Chrome...");

	}

}
 
 class WebExporerHelperFacade{
	 
	public static void generateReports(String explorer, String Report, String test ){
		
		Driver driver = null;
		
		switch (explorer) {
		
		case "FireFox":
			driver = Firefox.getFirefoxDriver();
			switch (Report) {
			case "HTML":
				Firefox.generateHTMLReport(test, driver);
				break;
				
			case "JUnit":
				Firefox.generateJUnitReport(test, driver);	
				break;
			}
		case "Chrome":
			driver = Chrome.getChromeDriver();
			switch (Report) {
			case "HTML":
				Chrome.generateHTMLReport(test, driver);
				break;
				
			case "JUnit":
				Chrome.generateJUnitReport(test, driver);	
				break;
			}	
		}
		
	}
	 
 }
 
  public class FacadePatternExample{
	  
	  public static void main(String[] args) {
		String test = "CheckElementPresent";
		WebExporerHelperFacade.generateReports("FireFox", "HTML", test);
		WebExporerHelperFacade.generateReports("FireFox", "JUnit", test);
		WebExporerHelperFacade.generateReports("Chrome", "HTML", test);
		WebExporerHelperFacade.generateReports("Chrome", "JUnit", test);
		
		
	}
	  
  }
 
 
