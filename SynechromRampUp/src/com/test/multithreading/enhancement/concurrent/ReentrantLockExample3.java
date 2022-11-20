package com.test.multithreading.enhancement.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Mythread2 extends Thread {
	static ReentrantLock lock = new ReentrantLock();

	String name;

	public Mythread2(String name) {
		super(name);
		// this.name = name;
	}

	public void run() {
		do{
		try {
			if (lock.tryLock(5000, TimeUnit.MILLISECONDS)) {

				System.out.println(Thread.currentThread().getName() + " get lock and do safe task");

				Thread.sleep(30000);
				lock.unlock();
				System.out.println(Thread.currentThread().getName() + " released lock ");
                break;
			} else
				System.out.println(Thread.currentThread().getName() + " unable to get lock and do alternative task");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}while(true);

	}
}

public class ReentrantLockExample3 {

	public static void main(String[] args) {

		Mythread2 t1 = new Mythread2("thread1");
		Mythread2 t2 = new Mythread2("thread2");
		t1.start();
		t2.start();

	}
}
