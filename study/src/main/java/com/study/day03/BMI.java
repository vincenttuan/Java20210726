package com.study.day03;

public class BMI {
	String name;
	double height;
	double weight;
	
	// 建構子: 用來初始化物件變數(name, height, weight)
	BMI(String n, double h, double w) { 
		name = n;
		height = h;
		weight = w;
	}
	
	double getBmiValue() {
		double bmi = weight / Math.pow(height/100, 2);
		return bmi;
	}
}
