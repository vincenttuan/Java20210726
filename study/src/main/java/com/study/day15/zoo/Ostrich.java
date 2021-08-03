package com.study.day15.zoo;

public class Ostrich extends Bird {
	Ostrich() {
		System.out.println("Ostrich 物件被建立");
		// setLegs(2); 可以不用寫
	}
	
	@Override
	void move() {
		System.out.println("我不會飛");
	}
}
