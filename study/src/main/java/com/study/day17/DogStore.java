package com.study.day17;

public class DogStore {

	public static void main(String[] args) {
		// interface 不可以直接 new
		//Dog dog = new Dog();
		Dog bigDog = new BigDog();
		System.out.println(Dog.legs);
		bigDog.eat();
		bigDog.skill();
		
		Dog smallDog = new SmallDog();
		smallDog.eat();
		smallDog.skill();
		
	}

}
