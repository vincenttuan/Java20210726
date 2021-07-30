package com.study.day12;

public class WrapperDemo2 {
	public static void main(String[] args) {
		
		String chineseString = "100";
		String mathString = "90";
		System.out.println(chineseString + mathString);
		// 將 數字字串 轉成 數字
		// case 1 (Java 5 以前)
		Integer a = Integer.valueOf(chineseString);
		Integer b = Integer.valueOf(mathString);
		System.out.println(a.intValue() + b.intValue());
		
		// case 2 (Java 5 (含)以後) auto-boxing / auto-unboxing
		System.out.println(a + b); // auto-unboxing,  a.intValue() + b.intValue()
		int c = Integer.valueOf(chineseString); // Integer -> int,  auto-unboxing
		int d = Integer.parseInt(mathString); // int
		System.out.println(c + d);
		
		// boxing : int -> Integer
		// unboxing : Integer -> int
		Integer x = 100; // 100 -> Integer.valueOf(100) auto-boxing
		int y = Integer.valueOf(200); // Integer.valueOf(200).intValue() -> 200 auto-unboxing
		
	}
}
