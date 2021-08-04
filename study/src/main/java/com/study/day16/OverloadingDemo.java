package com.study.day16;

public class OverloadingDemo {
//	public static void printData(int x) {
//		System.out.println("A: " + x);
//	}
//	public static void printData(float x) {
//		System.out.println("C: " + x);
//	}
//	public static void printData(double x) {
//		System.out.println("B: " + x);
//	}
	public static void printData(Integer x) {
		System.out.println("E: " + x);
	}
	public static void printData(Double x) {
		System.out.println("F: " + x);
	}
	public static void main(String[] args) {
		printData(10); // 10, 10.0f, 10.0d, Integer
		printData(3.14);

	}

}
