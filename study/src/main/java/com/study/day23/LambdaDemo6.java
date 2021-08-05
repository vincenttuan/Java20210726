package com.study.day23;

import java.util.Arrays;

public class LambdaDemo6 {

	public static void main(String[] args) {
		Integer[] scores = {40, 70, 50, 80, 100, 80};
		// 在 score >= 60 中任意取出一個成績
		int score = Arrays.stream(scores)
					.filter(x -> x >= 60)
					.findAny()
					.get();
		
		System.out.println(score);
		
		// 本次考試是否都 All pass ?
		Integer[] scores2 = {100, 50, 80, 70};
		boolean allPass = Arrays.stream(scores2)
						.allMatch(x -> x >= 60);
		
		System.out.println(allPass);
			

	}

}
