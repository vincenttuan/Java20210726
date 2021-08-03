package com.study.day15.zoo;

public class Animal {
	private int legs;
	
	Animal() {
		System.out.println("Animal 物件被建立");
	}
	
	void move() {
		System.out.println("我會動");
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
}
