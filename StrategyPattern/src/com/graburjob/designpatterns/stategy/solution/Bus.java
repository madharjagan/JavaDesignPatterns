package com.graburjob.designpatterns.stategy.solution;

public class Bus extends Vehicle {
	public Bus(){
		setAlgorithm(new GobyDrivingAlgorithm());
	}
}
