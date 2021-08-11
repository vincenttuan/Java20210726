package com.study.day33;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LongTask implements Runnable {

	@Override
	public void run() {
		Random r = new Random();
		System.out.println("長任務-開始");
		try {
			TimeUnit.SECONDS.sleep(r.nextInt(5) + 3);
		} catch (Exception e) {
			
		}
		System.out.println("長任務-結束");
	}
	
}
