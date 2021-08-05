package com.study.day23;

import java.util.Arrays;

public class LambdaDemo4 {

	public static void main(String[] args) {
		Object[] products = {"牛奶", 100, "咖啡", 50};
		// 請問此次消費金額 ?
		
		int sum = Arrays.stream(products)
				//.peek(p -> System.out.println(p + ", " + p.getClass().getSimpleName()))
				.filter(p -> p instanceof Integer) // Stream 
				//.peek(p -> System.out.println(p + ", " + p.getClass().getSimpleName()))
				.mapToInt(p -> ((Integer)p).intValue()) // IntStream
				//.peek(p -> System.out.println(p))
				.sum();
		System.out.println(sum);
	}

}
