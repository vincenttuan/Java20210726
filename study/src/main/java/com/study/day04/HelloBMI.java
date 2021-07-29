package com.study.day04;

public class HelloBMI {

	public static void main(String[] args) {
		BMI b1 = new BMI("John", 170, 60);
		BMI b2 = new BMI();
		b2.name = "Mary";
		//b2.height = -160;
		//b2.weight = -50;
		b2.setHeight(160);
		b2.setWeight(-50);
		
		System.out.println(b1.getBmiValue());
		double value = b2.getBmiValue();
		if(value > 0) {
			System.out.println(b2.getBmiValue());
		} else {
			System.out.println("身高或體重的資料有問題");
		}
	}

}
