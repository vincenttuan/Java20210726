package com.study.day29;

public class ThreadTest {

	public static void main(String[] args) {
		Even even = new Even();
		Odd odd = new Odd();
		odd.start();
		even.start();

	}

}
