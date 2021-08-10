package com.study.day29;

public class ThreadTest2 {

	public static void main(String[] args) {
		// 龜兔賽跑 (各自跑 1000 步)
		Race turtle = new Race();
		Race rabbit = new Race();
		turtle.setName("烏龜"); // 設定執行緒名字
		rabbit.setName("兔子");
		turtle.start(); // 執行緒啟動
		rabbit.start();
	}

}
