package com.test.multithreading.enhancement.threadgroup;

class MyThread extends Thread{
	
	public MyThread(ThreadGroup g, String name) {
	  super(g,name);
	}
	public void run(){
		System.out.println("child Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ThreadGroupExample4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup pg = new ThreadGroup("ParentGroup"); //new group
		ThreadGroup cg = new ThreadGroup(pg,"ChildGroup"); //new group
		MyThread t1 = new MyThread(pg, "childthread1");
		MyThread t2 = new MyThread(pg, "chilthread2");
		t1.start();
		t2.start();
		
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
	}

}
