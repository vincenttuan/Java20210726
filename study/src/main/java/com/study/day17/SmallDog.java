package com.study.day17;

//小狗
public class SmallDog implements Dog {

	@Override
	public void skill() {
		System.out.println("玩飛盤");
	}

	@Override
	public void eat() {
		System.out.println("牛肉");
	}
	
}
