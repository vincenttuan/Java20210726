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
		IntConsumer consumer1 = i -> {
			int n = random.nextInt(10); // 0-9
			nums.add(n);
		};
		IntConsumer consumer2 = i -> {
			int n = random.nextInt(100); // 0-99
			nums.add(n);
		};
		
		IntStream.rangeClosed(1, 4)
			.forEach(consumer1);
		
		System.out.println(nums);

	}

}
