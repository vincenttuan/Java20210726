package com.study.day23;

import java.util.function.BiConsumer;
import java.util.function.IntFunction;

public class LambdaDemo2 {

	public static void main(String[] args) {
		// 飲料 15 打 9 折
		// 使用 BiConsumer
		BiConsumer<Integer, Double> checkout = 
				                   (price, dicount) -> System.out.println(price * dicount);
		checkout.accept(15, 0.9);
		
		// 計算名字(String)的長度(int)
		IntFunction<String> sexName = (sex) -> {
			if(sex == 1) {
				return "男";
			} else if(sex == 2) {
				return "女";
			} else {
				return "錯誤";
			}
		}; 
		System.out.println(sexName.apply(1));
		System.out.println(sexName.apply(2));
		
	}

}
