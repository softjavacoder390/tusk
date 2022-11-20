package com.test.designpattern.behaverial.observer;

public class Subcriber implements Observer {
	
	private Subject channel = null;
	private String name;
	
	
	@Override
	public void update(){
		 
		 System.out.println("hey " +name+" video uploaded "+" title :"+channel.showTitile());
	 }


	public Subcriber(String name) {
		super();
		this.name = name;
	}
	 
	
	@Override
	public void subscribeChannel(Channel ch){
		channel = ch;
	}
	
	
	
	

}
