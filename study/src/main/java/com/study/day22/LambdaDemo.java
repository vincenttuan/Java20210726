package com.study.day22;

public class LambdaDemo {

	public static void main(String[] args) {
		// 使用匿名內部類別實現 Add 介面
		Add add1 = new Add() {
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(add1.calc(10, 20));

	}

}
