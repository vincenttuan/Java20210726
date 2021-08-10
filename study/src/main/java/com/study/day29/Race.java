package com.study.day29;

// 賽跑
public class Race extends Thread {

	@Override
	public void run() {
		job();
	}
	
	private void job() {
		// 要跑 1~1000
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑了 %d 步\n", tName, i);
		}
	} 
}
