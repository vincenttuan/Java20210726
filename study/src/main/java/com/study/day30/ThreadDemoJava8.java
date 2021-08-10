package com.study.day30;

import java.util.Random;

public class ThreadDemoJava8 {

	public static void main(String[] args) {
		
		Runnable lotto1 = () -> System.out.println(new Random().nextInt(100));
		
		Thread t1 = new Thread(lotto1);
		t1.start();

	}

}
