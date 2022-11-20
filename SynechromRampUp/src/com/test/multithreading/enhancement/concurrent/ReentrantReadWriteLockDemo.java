package com.test.multithreading.enhancement.concurrent;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class ReentrantReadWriteLockDemo {

	public static void main(String[] args) {
		ReentrantReadWriteLock rl = new ReentrantReadWriteLock();
		ReentrantReadWriteLock.ReadLock readlock = rl.readLock();

		Thread t[] = new Thread[3];
		for (int i = 1; i < 3; i++) {
			t[i] = new Thread(new Task1(readlock, "Thread " + i));
		}

		for (int i = 1; i < 3; i++) {
			t[i].start();
		}

	}
}

class Task1 implements Runnable {

	String name;
	ReentrantReadWriteLock.ReadLock rl;

	public Task1(ReentrantReadWriteLock.ReadLock rl, String name) {
		this.rl = rl;
		this.name = name;
	}

	public void run() {
		boolean bFlag = false;

		rl.lock();

		System.out.println("Lock hold count: ");
	}

}
