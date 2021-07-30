package com.study.day12;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class WrapperDemo4 {

	public static void main(String[] args) {
		Integer[] exams = { 100, 90, 80 };
		// 利用 Java 8 Stream 來分析
		// 取得統計資料
		IntSummaryStatistics stat = Arrays.stream(exams) // Stream<Integer> 並非 IntStream
			//.mapToInt(exam -> exam.intValue()) // 轉為 IntStream
			.mapToInt(exam -> exam) // 轉為 IntStream (auto-unboxing)
			.summaryStatistics();
		
		System.out.println(stat.getSum());
	}

}
