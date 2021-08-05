package com.study.day22;

public class CircleAreaMain {

	public static void main(String[] args) {
		// 若半徑 = 10, 求面積 = ?
		CircleArea circleArea = new CircleArea() {

			@Override
			public double calc(double r) {
				//double result = r * r * 3.14;
				double result = Math.pow(r, 2) * Math.PI;
				return result;
			}
			
		};
		
		System.out.println(circleArea.calc(10));

	}

}
