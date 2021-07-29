package com.study.day11;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MultiArrayJava8Demo3 {

	public static void main(String[] args) {
		Exam e1 = new Exam("Java", 90);
		Exam e2 = new Exam("Java", 80);
		Exam e3 = new Exam("Java", 100);
		Exam e4 = new Exam("Java", 40);
		Exam e5 = new Exam("VB", 60);
		// 請問此Java考生的平均分數 ? 最高最低分各是多少 ?
		// 用 Java 8
		Exam[] exams = {e1, e2, e3, e4, e5};
		IntSummaryStatistics stat = Arrays.stream(exams)
			.filter(e -> e.getName().equals("Java"))
			//.mapToInt(e -> e.getScore())
			.mapToInt(Exam::getScore)
			.summaryStatistics();
		
		System.out.println(stat.getAverage());
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
	}

}
