package com.study.day11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.function.IntPredicate;

public class MultiArrayJava8Demo1 {

	public static void main(String[] args) {

		int[] scores = { 100, 40, 80, 70, 50 };

		Arrays.stream(scores) // 得到一個 IntStream
				.forEach(score -> System.out.println(score));

		System.out.println("---------");

		// 方法參考「捷徑」 ::
		Arrays.stream(scores).forEach(System.out::println);

		System.out.println("---------");

		// 資料排序
		// sorted() 自然排序(小 -> 大)
		// unordered() 無序
		// boxed().sorted(Collections.reversrOrder()) 反序(大 -> 小)
		Arrays.stream(scores).sorted().forEach(System.out::println);
		Arrays.stream(scores).unordered().forEach(System.out::println);
		Arrays.stream(scores)
					.boxed() // int -> Integer
					.sorted(Collections.reverseOrder())
					.forEach(System.out::println);
		
		System.out.println("---------");

		// 過濾出(印出)及格或不及格的成績
		IntPredicate high = score -> score >= 80;
		IntPredicate pass = score -> score >= 60;
		IntPredicate fail = score -> score < 60;

		Arrays.stream(scores).filter(pass).forEach(System.out::println);

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
		System.out.printf("總分：%d 平均：%.1f 最大：%d 最小：%d 個數：%d\n", stat.getSum(), stat.getAverage(), stat.getMax(),
				stat.getMin(), stat.getCount());
	}

}
