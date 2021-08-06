package com.study.day24;

// 美元 penny=1 nickle=5 dime=10 quarter=25

class USCurrency {
	private int value;
	public USCurrency(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class EnumDemo {
	public static void main(String[] args) {
		USCurrency penny = new USCurrency(1);
		USCurrency nickle = new USCurrency(10); // 不合理參數
		USCurrency dime = new USCurrency(5); // 不合理參數
		USCurrency quarter = new USCurrency(250); // 錯誤參數
		System.out.println(penny.getValue());
		System.out.println(nickle.getValue());
		System.out.println(dime.getValue());
		System.out.println(quarter.getValue());
	}
}

