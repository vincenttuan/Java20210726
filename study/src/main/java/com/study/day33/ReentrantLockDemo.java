package com.study.day33;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class Lotto implements Runnable {
	private static final ReentrantLock LOCK = new ReentrantLock();
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		try {
			LOCK.lock(); // 嘗試鎖定
			for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
				int num = new Random().nextInt(100);
				System.out.printf("%s 得到第 %d 組號碼: %d\n", tName, i, num);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			LOCK.unlock(); // 釋放
		}
	}
	
}
public class ReentrantLockDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(new Lotto());
		service.execute(new Lotto());
		service.shutdown();
	}

}
