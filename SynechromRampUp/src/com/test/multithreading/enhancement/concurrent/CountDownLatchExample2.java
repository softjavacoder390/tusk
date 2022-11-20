package com.test.multithreading.enhancement.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DependentService implements Runnable {
	private CountDownLatch latch;

	public DependentService(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " hello");
       latch.countDown();
       
       try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       System.out.println(Thread.currentThread().getName() + " hi");
	}

}

public class CountDownLatchExample2 {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor = Executors.newFixedThreadPool(4);

		CountDownLatch latch = new CountDownLatch(3);
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		
		latch.await();
		
		System.out.println("All dependent services initialized...");

	}
}
