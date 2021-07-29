package com.study.day03;

public class HelloBMI {
	public static void main(String[] args) {
		BMI b1 = new BMI("John", 170, 60);
		BMI b2 = new BMI("Mary", 160, 50);
		System.out.println(b1.getBmiValue());
		System.out.println(b2.getBmiValue());
	}
}
