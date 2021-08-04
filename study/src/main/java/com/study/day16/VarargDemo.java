package com.study.day16;

public class VarargDemo {
	
	public static int add(int... array) {
		System.out.println(array + " 長度:" + array.length);
		int sum = 0;
		for(int x : array) {
			sum += x;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] array = {10, 20, 30};
		System.out.println(add(array));
		
		System.out.println(add(10, 20, 30)); // new int[]{10, 20, 30}
		
		System.out.println(add(10, 20)); // new int[]{10, 20}
		
		System.out.println(add(10, 20, 30, 40)); // new int[]{10, 20, 30, 40}
		
		System.out.println(add(10));
		
		System.out.println(add());
	}

}
