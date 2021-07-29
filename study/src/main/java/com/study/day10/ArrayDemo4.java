package com.study.day10;

import java.util.Arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[] poker = new int[13];
		for(int i=0;i<poker.length;i++) {
			poker[i] = i + 1;
		}
		// 洗牌前
		System.out.print("洗牌前:");
		System.out.println(Arrays.toString(poker));
		// 洗牌
		Util.shuffle(poker);
		// 洗牌後
		System.out.print("洗牌後:");
		System.out.println(Arrays.toString(poker));
		
	}

}
