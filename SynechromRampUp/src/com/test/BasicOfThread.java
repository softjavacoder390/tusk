package com.test;

public class BasicOfThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
		System.out.println("child thread" + i);
		}
		
	}
	
}
	class ThreadDemo
	{
	public static void main(String[] args)
	{
		BasicOfThread r=new BasicOfThread();
		Thread t1=new Thread();
		Thread t2=new Thread(r);
	r.run();
	for(int i=0;i<10;i++)
	{
	System.out.println("main thread" + i);
	}
	}
	}