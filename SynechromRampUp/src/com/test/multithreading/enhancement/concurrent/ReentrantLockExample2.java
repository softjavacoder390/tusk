package com.test.multithreading.enhancement.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


class Mythread1 extends Thread {
	static ReentrantLock lock = new ReentrantLock();

	String name;

	public Mythread1(String name) {
		super(name);
		//this.name = name;
	}

	public void run() {
		if (lock.tryLock()) {

			System.out.println(Thread.currentThread().getName() + " get lock and do safe task");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lock.unlock();

		}else
			System.out.println(Thread.currentThread().getName() + " unable to get lock and do alternative task");
			
	}
}

public class ReentrantLockExample2 {

	public static void main(String[] args) {

		Mythread1 t1 = new Mythread1("thread1");
		Mythread1 t2 = new Mythread1("thread2");
		t1.start();
		t2.start();

	}
}
