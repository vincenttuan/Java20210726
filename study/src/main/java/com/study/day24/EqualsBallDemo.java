package com.study.day24;

public class EqualsBallDemo {

	public static void main(String[] args) {
		Ball b1 = new Ball("Red", 100);
		Ball b2 = new Ball("Red", 100);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		// 二物件相等, 則二物件的 hashcode 值也必須相等
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
