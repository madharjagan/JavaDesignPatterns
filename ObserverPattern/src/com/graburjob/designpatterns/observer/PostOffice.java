package com.graburjob.designpatterns.observer;


import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {
	
	List<Observer> listOfObservers = new ArrayList<>();

	@Override
	public void addObserver(Observer obj) {
		listOfObservers.add(obj);
	}

	@Override
	public void removeObserver(Observer obj) {
		listOfObservers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		for (Observer tempobj:listOfObservers)
			tempobj.notifyObj();
	}

}
