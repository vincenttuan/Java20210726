package com.study.day06;

public class HelloPoint {
	public static void main(String[] args) {
		// 指數次方
		System.out.println(Math.pow(3, 2));
		// 開根號
		System.out.println(Math.sqrt(9));
		// 假設 a點(10, 20) b點(-15, 50)
		// 求 ab 線段的距離
		// 提示建立 PointDistance.java + 組合 Point
		Point p1 = new Point(10, 20);
		Point p2 = new Point(-15, 50);
		PointDistance pointDistance = new PointDistance(p1, p2);
		System.out.println(pointDistance.getDistance());
		// 觀察物件參數
		System.out.println(pointDistance);
	}
}
