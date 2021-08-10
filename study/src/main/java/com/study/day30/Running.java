package com.study.day30;

// 奧運 1000 m 跑步
// 執行緒工作 (Runnable)
public class Running implements Runnable {

	@Override
	public void run() {
		// 要跑 1~1000 公尺
		String tName = Thread.currentThread().getName();
		for (int i = 1; i <= 1000; i++) {
			System.out.printf("%s 跑了 %d 公尺\n", tName, i);
		}
	}

}
