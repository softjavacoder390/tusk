package com.test.multithreading.enhancement.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


class PassengerThread extends Thread{
	private int duration;
	CyclicBarrier cyclicBarrier;
	
	public PassengerThread(int duration, CyclicBarrier cyclicBarrier, String name) {
		super(name);
		this.duration = duration;
		this.cyclicBarrier = cyclicBarrier;
		
	}
	
	public void run(){
		
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName() +" is arrived..");
			
			int await = cyclicBarrier.await();
			//System.out.println("await :"+ await);
			if(await ==0){
				
				System.out.println("Four passengers have arrived so cab is going to start...");
				System.out.println(" All Four passengers have reached to their destiny...");
				
			}
			
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
public class CyclicBarrierExample1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : has Started....");
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
		
		
		PassengerThread p1 = new PassengerThread(1000,cyclicBarrier,"John");
		PassengerThread p2 = new PassengerThread(2000,cyclicBarrier,"manish");
		PassengerThread p3 = new PassengerThread(3000,cyclicBarrier,"harish");
		PassengerThread p4 = new PassengerThread(4000,cyclicBarrier,"sharad");
		
		
		PassengerThread p5 = new PassengerThread(1000,cyclicBarrier,"chandu");
		PassengerThread p6 = new PassengerThread(2000,cyclicBarrier,"shankar");
		PassengerThread p7 = new PassengerThread(3000,cyclicBarrier,"pankaj");
		PassengerThread p8 = new PassengerThread(4000,cyclicBarrier,"sanjay");
		
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
		
		
		System.out.println(Thread.currentThread().getName() + " : has Finished....");
	}
}
