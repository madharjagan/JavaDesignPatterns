package com.graburjob.designpatterns.stategy.solution;

public class AeroPlane extends Vehicle {

	public AeroPlane(){
		setAlgorithm(new GoByFlyingAlgorithm());
	}
}
