package com.study.day18;

public class DogStore {
	public static void main(String[] args) {
		Dog bigDog = new BigDog();
		Dog smallDog = new SmallDog();
		
		System.out.println(Dog.legs);
		bigDog.eat();
		smallDog.eat();
		
		bigDog.skill();
		smallDog.skill();
	}
}
