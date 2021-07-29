package com.study.day11;

import java.util.Arrays;

public class MultiArrayJava8Demo4 {
	public static void main(String[] args) {
		
		String[] names = {"Mary", "Jim", "Vincent", "Anita", "Jo", "abcdefg"};
		// 請問哪一個名字最長 ?
		// 使用 Java 8
		// Arrays.stream(names)
		Arrays.stream(names)
			//.mapToInt(name -> name.length())
			.mapToInt(String::length)
			.forEach(System.out::println);
		
		System.out.println("-------");
		
		int maxLen = Arrays.stream(names)
				.mapToInt(String::length)
				.max()
				.getAsInt();
		System.out.println(maxLen);
		
		System.out.println("-------");
		
		Arrays.stream(names)
			.filter(name -> name.length() == maxLen)
			.forEach(System.out::println);
		
		System.out.println("-------");
		
		String name = Arrays.stream(names)
					.filter(n -> n.length() == maxLen)
					.findFirst()
					.get();
		System.out.println(name);
	}
}
