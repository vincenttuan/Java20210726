package com.study.day04;

public class BMI {
	String name;
	private double height; // private 私有的
	private double weight;
	
	BMI() { // 無參數的建構子
		
	}
	
	BMI(String name, double height, double weight) {
		this.name = name;  // this. -> 念成 "物件的"
		setHeight(height);
		setWeight(weight);
	}
	
	// setter 的方法
	void setHeight(double height) {
		// 驗證 height 是否 > 0
		if(height > 0) {
			this.height = height;
		}
	}
	
	void setWeight(double weight) {
		// 驗證 weight 是否 > 0
		if(weight > 0) {
			this.weight = weight;
		}
	}
	
	double getBmiValue() {
		double bmi = weight / Math.pow(height/100, 2);
		return bmi;
	}
}
