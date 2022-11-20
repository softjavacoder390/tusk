package com.test.multithreading.enhancement.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class MyCallable implements Callable {
	int num;

	public MyCallable(int num) {
		this.num = num;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object call() throws Exception {

		System.out.println(
				Thread.currentThread().getName() 
				+ " its responsibility to find sum of given no. "
		+ num + " Numbers");
		int sum = 0;
		
		for (int i = 0; i <= num; i++) {
			 sum = sum+i;
			
		}
		return sum;
	}

}

public class CallableDemo1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable[] jobs = { new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50),
				new MyCallable(60)
		};
		ExecutorService service = Executors.newFixedThreadPool(6);
		
		for (MyCallable printJob : jobs) {
			
			Future f = service.submit(printJob);
			System.out.println(f.get());
		}
		service.shutdown();
		
	}
}
