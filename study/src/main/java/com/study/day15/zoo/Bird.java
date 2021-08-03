package com.study.day15.zoo;

public class Bird extends Animal {
	Bird() {
		System.out.println("Bird 物件被建立");
		setLegs(2);
	}

	@Override
	void move() {
		System.out.println("我會飛");
	}
	
	void birth() {
		System.out.println("我從蛋殼冒出來");
	}
	
}
