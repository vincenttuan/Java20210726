package com.study.day05;

public class HelloBMIResult {

	public static void main(String[] args) {
		// John, 170, 60, 是否標準 ?
		BMI bmi = new BMI("John", 170, 60);
		BMIResult bmiResult = new BMIResult(bmi);
		System.out.println(bmiResult.getResult());
		// 觀察 bmi(name, height, weight, bmi), bmiResult(result) 的物件屬性/變數資料
		System.out.println(bmiResult);
	}

}
