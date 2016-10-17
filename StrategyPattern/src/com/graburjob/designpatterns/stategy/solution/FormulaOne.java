package com.graburjob.designpatterns.stategy.solution;

public class FormulaOne extends Vehicle {

	public FormulaOne(){
		setAlgorithm(new GoByDrivingFastAlgorithm());
	}
}
