package com.study.day18;

// 狗的抽象類 abstract class
public abstract class ADog implements Dog {
	@Override
	public void eat() {
		System.out.println("牛肉");
	}
}