package com.study.day02;

public class HelloBMI {
	public static void main(String[] args) {
		BMI b1 = new BMI();
		b1.name = "John";
		b1.height = 170;
		b1.weight = 60;
		
		BMI b2 = new BMI();
		b2.name = "Mary";
		b2.height = 160;
		b2.weight = 50;
		
		System.out.println(b1.getBmiValue());
		System.out.println(b2.getBmiValue());
	}
}
