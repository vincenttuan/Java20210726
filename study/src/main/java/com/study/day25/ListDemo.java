package com.study.day25;

import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		Random random = new Random();
		// 可以放重複資料
		List<Integer> nums = new LinkedList<>();
		// 0~9 任意取 4 個 (四星彩 資料可重複)
		IntStream.rangeClosed(1, 4)
			.forEach(i -> {
				int n = random.nextInt(10); // 0-9
				nums.add(n);
			});
		
		System.out.println(nums);

	}

}
