package com.test.designpattern.behaverial.observer;

import java.awt.image.TileObserver;
import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subcriber> subcribersList = new ArrayList<>();

	String title;

	@Override
	public String showTitile(){
		 return title;
	}
	@Override
	public void subcribe(Subcriber sb) {
		subcribersList.add(sb);

	}

	@Override
	public void unSubcribe(Observer sb) {
		subcribersList.remove(sb);
	}

	
	@Override
	public void notifySubscriber( ) {

		for (Observer sb : subcribersList) {

			sb.update();
		}

	}
	
	
	@Override
	public void upload(String title){
		
		this.title = title;
		notifySubscriber();
	}
	

}
