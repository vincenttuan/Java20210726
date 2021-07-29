package com.study.day11;

public class StringAndStringBuilder {
	
	public static void add8(String x) {
		System.out.printf("x: %s\n", x);
		x = x.concat("8");
		System.out.printf("x: %s\n", x);
	}
	
	public static String add8_2(String x) {
		System.out.printf("x: %s\n", x);
		x = x.concat("8");
		System.out.printf("x: %s\n", x);
		return x;
	} 
	
	public static void add8(StringBuilder x) {
		System.out.printf("x: %s\n", x);
		x.append("8");
		System.out.printf("x: %s\n", x);
	}
	
	public static void main(String[] args) {
		String str = "Java";
		// Java8 part 1
		add8(str);
		System.out.printf("str: %s\n", str);
		System.out.println("---------------");
		// Java8 part 2
		str = add8_2(str);
		System.out.printf("str: %s\n", str);
		System.out.println("---------------");
		StringBuilder sb = new StringBuilder("Java");
		// Java8 (StringBuilder)
		add8(sb);
		System.out.printf("sb: %s\n", sb);
	}

}
