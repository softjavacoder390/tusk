package com.test.multithreading.enhancement.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class QATeam extends Thread {

	public QATeam(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("Tast assigned to development team " + Thread.currentThread().getName());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Tast finished to development team " + Thread.currentThread().getName());


	}
	
}

class DevTeam extends Thread {
	private CountDownLatch countDownLatch;

	public DevTeam(CountDownLatch countDownLatch, String name) {
		super(name);
		this.countDownLatch = countDownLatch;
	}

	public void run() {
		System.out.println("Tast assigned to development team " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//uncomment to see partially completed work by teamA and TeamB and then get
		//chance QATeam to execute
		
//		countDownLatch.countDown();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		System.out.println("Tast finished to development team " + Thread.currentThread().getName());

		countDownLatch.countDown();

	}
}

public class CountDownLatchExample1 {

	public static void main(String[] args) throws InterruptedException {
		 
		CountDownLatch countDownLatch = new CountDownLatch(2);
		
		DevTeam teamDevA = new DevTeam(countDownLatch, "Dev-A");
		DevTeam teamDevB = new DevTeam(countDownLatch, "Dev-B");
		
		teamDevA.start();
		teamDevB.start();
		
		countDownLatch.await();
		
		//or
		
//		DevTeam teamDevC = new DevTeam(countDownLatch, "Dev-C");
//		DevTeam teamDevD = new DevTeam(countDownLatch, "Dev-D");
//		teamDevC.start();
//		teamDevD.start();
//		countDownLatch.await();
		
		//or
//		CountDownLatch countDownLatch1 = new CountDownLatch(2);	countDownLatch.await();
//		DevTeam teamDevC = new DevTeam(countDownLatch1, "Dev-C");
//		DevTeam teamDevD = new DevTeam(countDownLatch1, "Dev-D");
//		teamDevC.start();
//		teamDevD.start();
//		countDownLatch1.await();
		
		//or
		//countDownLatch.await(5000,TimeUnit.MILLISECONDS);
		
		QATeam qaTeam = new QATeam("QA Team");
		qaTeam.start();
		
		
	}
}
