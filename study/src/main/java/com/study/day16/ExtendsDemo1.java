package com.study.day16;

//final class A {
class A {	
	//final void play() {
	void play() {
		System.out.println("Play A");
	} 
}

class B extends A {
	@Override
	void play() {
		System.out.println("Play B");
	}
}

public class ExtendsDemo1 {

	public static void main(String[] args) {
		//final int x = 100;
		//x = 200;
		final int y;
		y = 100;
		//y = 200;
				

	}

}
