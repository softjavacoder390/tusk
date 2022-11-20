package com.test.designpattern.behaverial.observer;

public class Youtube {
	
	public static void main(String[] args) {
		
		Channel udemy = new Channel();
		
		Subcriber s1 = new Subcriber("Bharat");
		Subcriber s2 = new Subcriber("prasad");
		Subcriber s3 = new Subcriber("sumit");
		Subcriber s4 = new Subcriber("sneha");
		Subcriber s5 = new Subcriber("mukesh");
		
		s1.subscribeChannel(udemy);
		s2.subscribeChannel(udemy);
		s3.subscribeChannel(udemy);
		s4.subscribeChannel(udemy);
		s5.subscribeChannel(udemy);
		
		udemy.subcribe(s1);
		udemy.subcribe(s2);
		udemy.subcribe(s3);
		udemy.subcribe(s4);
		udemy.subcribe(s5);
		
		
		udemy.upload("Interview Question Set !");
		
		
		
		
		
	}

}
