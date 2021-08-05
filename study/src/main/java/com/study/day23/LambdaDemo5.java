package com.study.day23;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaDemo5 {

	public static void main(String[] args) {
		// 圓面積 r(Double)=10.0 結果(Double): 314.15...
		Function<Double, Double> area = (r) -> Math.pow(r, 2) * Math.PI;
		System.out.println(area.apply(10.0));
		
		/*
		public interface UnaryOperator<T> extends Function<T,T>{
			T apply(T t);
		}
		*/
		UnaryOperator<Double> area2 = (r) -> Math.pow(r, 2) * Math.PI;
		System.out.println(area2.apply(10.0));
		
		
		BiFunction<Double, Double, Double> bmi = (h, w) -> w / Math.pow(h/100, 2);
		System.out.println(bmi.apply(170.0, 60.5));
		
		/*
		public interface BinaryOperator<T> extends BiFunction<T,T,T> {
			T apply(T t1, T t2)
		}
		*/
		BinaryOperator<Double> bmi2 = (h, w) -> w / Math.pow(h/100, 2); 
		System.out.println(bmi2.apply(170.0, 60.5));
	}

}
