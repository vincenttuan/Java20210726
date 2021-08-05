package com.study.day23;

import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		// Consumer
		// 印出: <T> 歡迎光臨 !
		Consumer<String> hello = (String name) -> System.out.println(name + " 歡迎光臨 !");
		hello.accept("John");
		Consumer<Integer> twoSum = (Integer n) -> System.out.println(2 * n);
		twoSum.accept(10);
		
		// Function
		Function<Integer, Double> area = (Integer r) -> Math.pow(r, 2) * Math.PI;
		System.out.println(area.apply(10));
		
		// Predicate
		Predicate<Integer> check = (Integer score) -> score >= 60;
		System.out.println(check.test(75));
		
		// Supplier
		Supplier<Date> now = () -> new Date();
		System.out.println(now.get());
		
		Supplier<String> welcome = () -> "歡迎光臨";
		System.out.println(welcome.get());
		
		Supplier<Integer> luckyNumber = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		System.out.println(luckyNumber.get());
		
	}

}
