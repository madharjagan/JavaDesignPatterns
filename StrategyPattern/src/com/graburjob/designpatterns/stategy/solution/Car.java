package com.graburjob.designpatterns.stategy.solution;

public class Car extends Vehicle {
	public Car(){
		setAlgorithm(new GobyDrivingAlgorithm());
	}
}
