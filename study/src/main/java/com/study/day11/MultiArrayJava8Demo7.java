package com.study.day11;

import java.util.Arrays;

public class MultiArrayJava8Demo7 {

	public static void main(String[] args) {
		int[][] scores = { { 100, 90, 70 }, { 80, 70, 60 } };
		// 各別求出每一筆資料的總和
		Arrays.stream(scores)
				// mapToInt 會自動將數字轉成串流
				.mapToInt(score -> Arrays.stream(score).sum())
				.forEach(System.out::println);

		// 求出資料的總和
		int sum = Arrays.stream(scores)
				// mapToInt 會自動將數字轉成串流
				.mapToInt(score -> Arrays.stream(score).sum())
				.sum();
		System.out.println(sum);			

	}

}
