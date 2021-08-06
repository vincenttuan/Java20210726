package com.study.day25;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(100, 5);
		System.out.printf("size: %d\n", v.size());
		System.out.printf("capacity: %d\n", v.capacity());
		
		for(int i=1;i<=100;i++) {
			v.add(i);
		}
		
		v.add(101);
		
		System.out.printf("size: %d\n", v.size());
		System.out.printf("capacity: %d\n", v.capacity());
		
	}

}
