package com.study.day29;

// 賽跑
public class Race extends Thread {
	
	private static String winner = null;
	
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
		// 跑完比賽
		// 檢查 winner 是否有資料 ?
		if(winner == null) {
			winner = tName;
		} else {
			printWinner();
		}
	}
	
	public static void printWinner() {
		System.out.printf("Winner: %s\n", winner);
	}
}
