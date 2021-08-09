package com.study.day26;

import java.math.BigDecimal;

public class CheckNumber {

	public static void main(String[] args) {
		double x = 10.0/2;
		System.out.println(x);
		// NaN =  Not a Number
		System.out.println(Double.isNaN(x));
		
		double y = 10.0/0;
		System.out.println(y);
		System.out.println(Double.isNaN(y));
		
		double z = 0.0/0.0;
		System.out.println(z);
		System.out.println(Double.isNaN(z));
		
		System.out.println((0.1 + 0.1) == 0.2);
		System.out.println((0.1 + 0.1 + 0.1) == 0.3);
		System.out.println(10 + 10 + 10 == 30);
		
		BigDecimal a = new BigDecimal("0.1"); // 要放字串
		BigDecimal b = new BigDecimal("0.1");
		BigDecimal c = new BigDecimal("0.1");
		BigDecimal d = a.add(b).add(c);
		System.out.println(d);
		System.out.println(d.doubleValue() == 0.3);
		
		System.out.printf("%.1f\n", (0.1+0.1+0.1));
		
		double e = Double.parseDouble(String.format("%.1f", (0.1+0.1+0.1)));
		System.out.println(e);
		System.out.println(e == 0.3);
	}

}
