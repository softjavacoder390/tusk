package com.test.concurrentcollection;

import java.util.HashMap;
import java.util.Map;


public class ConcurrentModificationConcorrentMap extends Thread{

	static Map<String,Integer> map = new HashMap();
	public void run(){
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("manish", 33);
		
	}
	public static void main(String[] args) {
		
		map.put("harish", 31);
		map.put("sharad", 38);
		map.put("bharat", 31);
		map.put("chandu", 26);
		map.put("chandu", 34);
		
		ConcurrentModificationConcorrentMap t = new ConcurrentModificationConcorrentMap();
		
		t.start();
		
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			
			System.out.println("name : "+entry.getKey());
			System.out.println("age : "+entry.getValue());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
