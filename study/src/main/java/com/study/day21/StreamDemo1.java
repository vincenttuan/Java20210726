package com.study.day21;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class StreamDemo1 {

	public static void main(String[] args) {
		String[] names = {"Jo", "John", "Jackson", "Vincent", "Anita", "Alex"};
		
		Arrays.stream(names).forEach(name -> System.out.println(name));
		
		System.out.println("-------------");
		
		Arrays.stream(names)
			.filter(name -> name.length() > 4)
			.forEach(name -> System.out.println(name));
		
		System.out.println("-------------");
		// 印出每一個名字的長度 case 1
		Arrays.stream(names).forEach(name -> System.out.println(name.length()));
		
		System.out.println("-------------");
		// 印出每一個名字的長度 case 2
		Arrays.stream(names)
			.mapToInt(name -> name.length())
			.forEach(name -> System.out.println(name));
		
		System.out.println("-------------");
		// 求出每一個名字的長度的總和
		int sum = Arrays.stream(names)
			.mapToInt(name -> name.length())
			.sum();
		System.out.println(sum);
		System.out.println("-------------");
		// 統計資料
		IntSummaryStatistics stat = Arrays.stream(names)
			.mapToInt(name -> name.length())
			.summaryStatistics();
		System.out.println(stat);
		System.out.println(stat.getAverage());
		System.out.println(stat.getSum());
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
	}

}
