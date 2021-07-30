package com.study.day11;

import java.util.Arrays;

public class MultiArrayJava8Demo9 {
	public static void main(String[] args) {
		Exam e1 = new Exam("Java", 90);
		Exam e2 = new Exam("Java", 80);
		Exam e3 = new Exam("Java", 100);
		Exam e4 = new Exam("Java", 40);
		Exam e5 = new Exam("VB", 60);
		
		Exam[][] exams = { {e1, e2} , {e3, e4}, {e5} };
		// 不分科目，求總分 = ?
		// { {e1, e2}, {e3, e4}, {e5} }
		// flatMap
		// { e1, e2, e3, e4, e5 }
		// mapToInt
		// { 90, 80, 100, 40, 60 }
		
		Arrays.stream(exams)
			.forEach(System.out::println);
		
		System.out.println();
		
		int sum = Arrays.stream(exams)
				.flatMap(exam -> Arrays.stream(exam))
				//.peek(System.out::println)
				.mapToInt(exam -> exam.getScore())
				//.peek(System.out::println)
				.sum();
		System.out.println(sum);
		
		// Java科目的總分 = ?
		int sum2 = Arrays.stream(exams)
				.flatMap(exam -> Arrays.stream(exam))
				//.peek(System.out::println)
				.filter(exam -> exam.getName().equals("Java"))
				//.peek(System.out::println)
				.mapToInt(exam -> exam.getScore())
				//.peek(System.out::println)
				.sum();
		System.out.println(sum2);
	}
}
