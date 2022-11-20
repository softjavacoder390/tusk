package com.test.multithreading.enhancement.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {

	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + "...job started by Thread :" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name +"...job completeed by Thread : "+Thread.currentThread().getName());
	}

}

public class ExecutorServiceExample1 {

	public static void main(String[] args) {
		
		PrintJob[] jobs = { new PrintJob("bharat"),
				new PrintJob("harish"),
				new PrintJob("sankar"),
				new PrintJob("sharad"),
				new PrintJob("manish"),
				new PrintJob("chandu")
		};
		ExecutorService service = Executors.newFixedThreadPool(8);
		
		for (PrintJob printJob : jobs) {
			
			service.submit(printJob);
		}
		service.shutdown();
		
		
	}
}
