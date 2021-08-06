package com.study.day24;

public class EqualsDemo {

	public static void main(String[] args) {
		// 物件內容相等使用 equals
		StringBuilder sb = new StringBuilder("Java");
		String s = new String("Java");
		System.out.println(sb.equals(s));
		System.out.println(sb.toString().equals(s));
		// 二物件相等, 則二物件的 hashcode 值也必須相等
		System.out.println(sb.toString().hashCode());
		System.out.println(s.hashCode());
		
		System.out.println(sb.toString());
		System.out.println(s);
	}

}
