package com.study.day31;

import java.util.concurrent.CyclicBarrier;

public class CarMain {

	public static void main(String[] args) {
		int n = 3;
		Runnable eat = () -> System.out.println("吃中餐...");
		CyclicBarrier cyclicBarrier = new CyclicBarrier(n, eat);
		new Car(cyclicBarrier, "A1").start();
		new Car(cyclicBarrier, "B1").start();
		new Car(cyclicBarrier, "C1").start();
		
	}

}
