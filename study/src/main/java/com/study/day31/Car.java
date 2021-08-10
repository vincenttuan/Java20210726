package com.study.day31;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
	
	private CyclicBarrier cyclicBarrier; // 循環屏障
	
	public Car(CyclicBarrier cyclicBarrier, String tName) {
		super(tName);
		this.cyclicBarrier = cyclicBarrier;
	}
	
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 從台北出發\n", tName);
		try {
			Random r = new Random();
			Thread.sleep(r.nextInt(5000)); // 模擬開車時間
			System.out.printf("%s 到台中了\n", tName);
			cyclicBarrier.await(); // 等待其他人
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.printf("%s 繼續往高雄出發\n", tName);
	}
	
}
