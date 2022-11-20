package com.test.collection;

import java.util.Collections;
//Java code to illustrate
//Fail Fast Iterator in Java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {
	public static void main(String[] args)
	{
		Map<String, String> cityCode = new HashMap<String, String>();
		//Collections.synchronizedMap(cityCode);
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator iterator = cityCode.keySet().iterator();
		//cityCode.put("Istanbul", "Turkey"); // uncomment and see the diffence
  
		while (iterator.hasNext()) { // whenever hashnext() method call it will check moudcount value first defaul value of modcount is 0
			System.out.println(cityCode.get(iterator.next()));

			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			cityCode.put("Istanbul", "Turkey");
		}
	}
}
