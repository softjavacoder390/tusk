package com.test;

public class Thread44Demo extends Thread {
	Thread t;
	static int count=1;
	public Thread44Demo() {
	t=new Thread("Start "+count);
	count++;
	t.start();
	}
	@Override
	public void run() {
	System.out.println("ThreadDemo.run() "+t.getName());
	super.run();
	}

	public static void main(String[] args) throws InterruptedException {
	Thread44Demo t=new Thread44Demo();
	t=new Thread44Demo();
	//t=new ThreadDemo();
	//t=new ThreadDemo();
	//t=new ThreadDemo();
	}
	}