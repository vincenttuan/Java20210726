package com.study.day29;

// 印出 1~1000 的奇數
public class Odd extends Thread {
	
	@Override
	public void run() {
		job();
	}

	private void job() {
		// 取得執行緒的名字
		String tName = Thread.currentThread().getName();
		for(int i=1;i<1000;i+=2) {
			System.out.printf("(%s) Odd = %d\n", tName, i);
			if(i == 499) {
				throw new RuntimeException("強迫停止");
			}
		}
	}
	
}
