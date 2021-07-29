package com.study.day11;

import java.util.Arrays;

public class MultiArrayJava8Demo2 {

	public static void main(String[] args) {
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("數學", 90);
		Exam e3 = new Exam("英文", 80);
		Exam e4 = new Exam("國文", 60);
		Exam e5 = new Exam("數學", 70);
		Exam e6 = new Exam("英文", 90);
		
		Exam[] exams = {e1, e2, e3, e4, e5, e6};
		
		Arrays.stream(exams)
				.forEach(e -> System.out.println(e.getName() + "=" + e.getScore()));
				
		Arrays.stream(exams)
				.forEach(System.out::println);
		
		System.out.println("--------------------------");
		// 請求用 java8 語法求出國文
		// 提示：filter
		Arrays.stream(exams)
			.filter(e -> e.getName().equals("國文"))
			.forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		// 請求用 java8 語法求出國文的分數
		/*
		 Exam [name=國文, score=100] Exam [name=國文, score=60]
		                    mapToInt
		                   [100,  60]  <-- IntStream    
		 * */
		Arrays.stream(exams)
			.filter(e -> e.getName().equals("國文"))
			.mapToInt(e -> e.getScore())
			.forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		double avg = Arrays.stream(exams)
					.filter(e -> e.getName().equals("國文"))
					.mapToInt(e -> e.getScore())
					.average()
					.getAsDouble();
		System.out.print(avg);
	}

}
