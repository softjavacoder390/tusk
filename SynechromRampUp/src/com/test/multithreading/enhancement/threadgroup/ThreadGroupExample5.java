package com.test.multithreading.enhancement.threadgroup;


public class ThreadGroupExample5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		 ThreadGroup system =Thread.currentThread().getThreadGroup().getParent();
		 Thread[] t = new Thread[system.activeCount()];
		 system.enumerate(t);
		 
		 for (Thread thread : t) {
			System.out.println(thread.getName() +"****"+thread.isDaemon());
		}
		 System.out.println("subgruop list***************");
		 ThreadGroup cg = new ThreadGroup(system,"ChildGroup"); //new group
		 ThreadGroup[] t1 = new ThreadGroup[system.activeGroupCount()];
		 system.enumerate(t1);
		  for (ThreadGroup threadGroup : t1) {
			  System.out.println(threadGroup.getName() +"****"+threadGroup.isDaemon());
		}
	}

}
