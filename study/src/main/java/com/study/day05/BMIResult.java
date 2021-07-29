package com.study.day05;

// 取得 BMI 結果 : 過重, 過輕, 標準
// 設計模式: 組合
public class BMIResult {
	private String result;
	private BMI bmi;
	
	public BMIResult(BMI bmi) {
		this.bmi = bmi;
		// 分析
		double bmiValue = this.bmi.getBmi();
		if(bmiValue > 23) {
			result = "過胖";
		} else if (bmiValue <= 18) {
			result = "過輕";
		} else {
			result = "正常";
		}
	}

	public String getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "BMIResult [result=" + result + ", bmi=" + bmi + "]";
	}
	
	
}
