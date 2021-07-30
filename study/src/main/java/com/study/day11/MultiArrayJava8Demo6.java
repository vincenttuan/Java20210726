package com.study.day11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiArrayJava8Demo6 {

	public static void main(String[] args) {
		int[][] scores = {{100, 90, 70}, {80, 70, 60}};
		// 各別求出每一筆資料的總和
		// {{100, 90, 70}, {80, 70, 60}};
		// 轉變為
		// { 260, 210 }
		Arrays.stream(scores)
			.flatMapToInt(score -> {
				// {100, 90, 70} -> 260
				// 260 轉 IntStream 串流
				int sum = Arrays.stream(score).sum();
				return IntStream.of(sum); // 將 int 資料轉 IntStream
			})
			.forEach(System.out::println);
		
	}

}
