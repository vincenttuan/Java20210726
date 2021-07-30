package com.study.day11;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class MultiArrayJava8Demo8 {

	public static void main(String[] args) {
		// 有三組 {身高, 體重} 的資料
		// 請各別求出 bmi 的資料
		double[][] values = {{170, 60}, {180, 80}, {160, 50} };
		
		Arrays.stream(values)
			.forEach(value -> System.out.println(value));
		
		// case 1
		Arrays.stream(values)
			.forEach(value -> {
				double h = value[0];
				double w = value[1];
				double bmi = w / Math.pow(h/100, 2);
				System.out.printf("%.2f\n", bmi);
			});
		
		// case 2
		Arrays.stream(values)
			.mapToDouble(value -> {
				double h = value[0];
				double w = value[1];
				double bmi = w / Math.pow(h/100, 2);
				return bmi;
			})
			.forEach(System.out::println);
		
		// case 3
		Arrays.stream(values)
			.flatMapToDouble(value -> {
				double h = value[0];
				double w = value[1];
				double bmi = w / Math.pow(h/100, 2);
				return DoubleStream.of(bmi);
			})
			.forEach(System.out::println);
	}

}
