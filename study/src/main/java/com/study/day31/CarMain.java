package com.study.day31;

import java.util.concurrent.CyclicBarrier;

public class CarMain {

	public static void main(String[] args) {
		int n = 3;
		CyclicBarrier cyclicBarrier = new CyclicBarrier(n);
		new Car(cyclicBarrier, "A").start();
		new Car(cyclicBarrier, "B").start();
		new Car(cyclicBarrier, "C").start();

	}

}
