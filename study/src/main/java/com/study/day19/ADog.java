package com.study.day19;

// 抽象類別
public abstract class ADog {
	public static final int legs = 4;
	
	public void eat() {
		System.out.println("牛肉");
	}
	
	public abstract void skill(); // 抽象方法
	
}
