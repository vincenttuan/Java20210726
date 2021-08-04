package com.study.day16;

import java.util.Random;

class Father2 {
	public void play() {
		System.out.println("Golf");
	}
}

class Son2 extends Father2 {

	@Override
	public void play() {
		Random r = new Random();
		if(r.nextInt(10) % 2 == 0) {
			System.out.println("LoL");
		} else {
			super.play();
		}
	}
	
}

public class ThisAndSuper {

	public static void main(String[] args) {
		new Son2().play();
	}

}
