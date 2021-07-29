package com.study.day01;

public class HelloBMI {

	public static void main(String[] args) {
		String name = "John";
		double h = 170;
		double w = 60;
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("%s bmi = %.2f\n", name, bmi);
		
		String name2 = "Mary";
		double h2 = 160;
		double w2 = 50;
		double bmi2 = w2 / Math.pow(h2/100, 2);
		System.out.printf("%s bmi = %.2f\n", name2, bmi2);
	}

}
