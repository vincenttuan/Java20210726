package com.study.day02;

// 設計一個 BMI 類別物件
// 需求 : 存放 人名 身高 體重  <-- 屬性
//        計算 BMI 值         <-- 方法        
public class BMI {
	String name;   // 人名
	double height; // 身高
	double weight; // 體重
	
	// 取得 bmi 的計算結果(計算結果也就是回傳值是 double)
	double getBmiValue() {
		// 實作 bmi 的計算公式
		double bmi = weight / Math.pow(height/100, 2);
		// 回傳(return) bmi 的結果
		return bmi;
	}
}
