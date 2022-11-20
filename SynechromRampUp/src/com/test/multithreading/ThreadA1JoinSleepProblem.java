package com.test.multithreading;


class ThreadB extends Thread{
	
	int total =0;
	public void run(){
		for (int i = 0; i <= 100; i++) {
			
			total = total+i;
		}
	}
	
}
public class ThreadA1JoinSleepProblem {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB t = new ThreadB();
		
		t.start();
		//Thread.sleep(0,1);
		t.join();
		System.out.println(t.total);
	}
	

}
