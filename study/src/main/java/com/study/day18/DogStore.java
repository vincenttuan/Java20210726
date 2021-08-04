package com.study.day18;

import java.util.Arrays;

public class DogStore {
	public static void main(String[] args) {
		Dog bigDog = new BigDog();
		Dog smallDog = new SmallDog();
		Dog eDog = new EDog();
		Dog chihuahua = new Chihuahua();
		
		Dog[] dogs = {bigDog, smallDog, eDog, chihuahua};
		//Arrays.stream(dogs).forEach(dog -> printDog(dog));
		Arrays.stream(dogs).forEach(DogStore::printDog);
		
	}
	
	public static void printDog(Dog dog) {
		System.out.println(dog.getClass().getSimpleName());
		System.out.println(Dog.legs);
		dog.eat();
		dog.skill();
		System.out.println("------------");
	}
	
}
