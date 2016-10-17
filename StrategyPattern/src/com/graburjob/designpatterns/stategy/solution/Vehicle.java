package com.graburjob.designpatterns.stategy.solution;

public abstract class Vehicle {

	GoAlgoritham algorithm;
	
	public void setAlgorithm(GoAlgoritham algorithm) {
		this.algorithm = algorithm;
	}

	public void go(){
		algorithm.go();
	}
}
