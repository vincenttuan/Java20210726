package com.study.day30;

// 奧運 1000 m 游泳
// 執行緒工作 (Runnable)
public class Swimming implements Runnable {

	@Override
	public void run() {
		// 要游 1~1000 公尺
		String tName = Thread.currentThread().getName();
		for (int i = 1; i <= 1000; i++) {
			System.out.printf("%s 游了 %d 公尺\n", tName, i);
		}
	}

}
