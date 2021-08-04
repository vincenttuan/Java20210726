package com.study.day21;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class StreamDemo2 {
	public static void main(String[] args) {
		String[] scores = {"100", "90.5", "75.5", "45.0"};
		// 求總分 = ?
		// 提示: 字串(score)轉浮點數 -> Double.parseDouble(score)
		DoubleSummaryStatistics stat = Arrays.stream(scores)
			.mapToDouble(score -> Double.parseDouble(score))
			.summaryStatistics();
		
		System.out.println(stat.getSum());
		System.out.println(stat.getAverage());
	}
}
