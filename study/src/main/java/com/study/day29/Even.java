package com.study.day29;

// 印出 1~1000 的偶數
public class Even extends Thread {
	
	@Override
	public void run() {
		job();
	}

	private void job() {
		// 取得執行緒的名字
		String tName = Thread.currentThread().getName();
		for(int i=2;i<=1000;i+=2) {
			System.out.printf("(%s) Even = %d\n", tName, i);
		}
	}
	
}
