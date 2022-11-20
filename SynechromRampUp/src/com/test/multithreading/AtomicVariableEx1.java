package com.test.multithreading;

//creating a thread by extending a thread class
class myThread extends Thread {

	// declaring a count variable
	private int count;

	public void run() {
		// calculating the count
		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(i * 100);
				count++;
			} catch (InterruptedException e) { // throwing an exception
				System.out.println(e);
			}
		}
	}

	// returning the count value
	public int getCount() {
		return this.count;
	}
}

// driver class
public class AtomicVariableEx1 {

	// main method
	public static void main(String[] args) throws InterruptedException {

		// creating an thread object
		myThread t = new myThread();
		//Thread t1 = new Thread(t, "t1");
		myThread t2 = new myThread();

		// starting thread t1
		t.start();
		//Thread t2 = new Thread(t, "t2");

		// starting thread t2
		t2.start();

		// calling join method on thread t1
		t.join();
		

		// calling join method on thread t1
		t2.join();

		// displaying the count
		System.out.println("count=" + t.getCount());
	}
}
