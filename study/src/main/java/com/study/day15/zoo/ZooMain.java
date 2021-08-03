package com.study.day15.zoo;

public class ZooMain {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		System.out.printf("%s 有 %d 條腿\n", 
				tiger.getClass().getSimpleName(), 
				tiger.getLegs());
		tiger.move();
		
		Fish fish = new Fish();
		System.out.printf("%s 有 %d 條腿\n", 
				fish.getClass().getSimpleName(), 
				fish.getLegs());
		fish.move();
		
	}

}
