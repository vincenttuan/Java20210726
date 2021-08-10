package com.study.day30;

// 奧運 1000 m 自行車
// 執行緒工作 (Runnable)
public class Cycling implements Runnable {

	@Override
	public void run() {
		// 要騎 1~1000 公尺
		String tName = Thread.currentThread().getName();
		for (int i = 1; i <= 1000; i++) {
			System.out.printf("%s 騎了 %d 公尺\n", tName, i);
		}
	}

}
