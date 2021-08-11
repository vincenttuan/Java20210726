package com.study.day33;

import java.util.concurrent.atomic.AtomicInteger;

class MyThread implements Runnable {
	private static AtomicInteger count = new AtomicInteger(0);
	@Override
	public void run() {
		int x = count.incrementAndGet(); // 保證不被其他執行緒插斷
		System.out.print(x + " ");
	}
}

public class AtomicDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		Thread t3 = new Thread(new MyThread());
		Thread[] threads = {t1, t2, t3};
		for(int i=0;i<threads.length;i++) {
			threads[i].start();
		}
		System.out.println("印出來的結果是無序的");
	}
}	
