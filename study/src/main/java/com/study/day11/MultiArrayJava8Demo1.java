package com.study.day11;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MultiArrayJava8Demo1 {

	public static void main(String[] args) {
		
		int[] scores = {100, 40, 80, 70, 50};
		
		Arrays.stream(scores)  // 得到一個 IntStream
			  .forEach(score -> System.out.println(score));
		
		System.out.println("---------");
		
		// 方法參考「捷徑」 ::
		Arrays.stream(scores)
		      .forEach(System.out::println);
		
		System.out.println("---------");
		
		// 過濾出(印出)及格的成績
		Arrays.stream(scores)
			  .filter(score -> score >= 60)
		      .forEach(System.out::println);
		
		System.out.println("---------");
		
		// 計算總分
		int sum = Arrays.stream(scores).sum();
		// 計算平均
		double avg = Arrays.stream(scores).average().getAsDouble();
		System.out.printf("總分：%d 平均：%.1f\n", sum, avg);
		
		System.out.println("---------");
		
		// 敘述統計
		IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
		System.out.println(stat);
		System.out.printf("總分：%d 平均：%.1f 最大：%d 最小：%d 個數：%d\n", 
				          stat.getSum(),
				          stat.getAverage(),
				          stat.getMax(),
				          stat.getMin(),
				          stat.getCount());
	}

}






