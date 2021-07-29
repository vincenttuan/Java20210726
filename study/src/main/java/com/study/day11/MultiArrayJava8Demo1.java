package com.study.day11;

import java.util.Arrays;

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
		
		
	}

}
