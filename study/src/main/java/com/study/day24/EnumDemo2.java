package com.study.day24;

//美元 penny=1 nickle=5 dime=10 quarter=25

enum USCoin {
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	
	private int value;
	
	USCoin(int value) { // enum 的建構子一定是 private 權限
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class EnumDemo2 {
	public static void main(String[] args) {
		USCoin penny = USCoin.PENNY;
		System.out.println(penny.getValue());
		
		USCoin nickle = USCoin.NICKLE;
		System.out.println(nickle.getValue());
	}
}
