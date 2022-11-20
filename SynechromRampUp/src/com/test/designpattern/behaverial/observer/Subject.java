package com.test.designpattern.behaverial.observer;

public interface Subject {
	String title =null;
	void subcribe(Subcriber sb);

	void unSubcribe(Observer sb);

	void notifySubscriber();

	void upload(String title);
	 String showTitile();

}