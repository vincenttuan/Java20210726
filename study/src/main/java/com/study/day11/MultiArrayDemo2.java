package com.study.day11;

import java.util.Arrays;

public class MultiArrayDemo2 {

	public static void main(String[] args) {
		// 二維陣列初始值
		int[][] m = { { 100, 90, 80 } , { 95, 85, 75 } };
		Util.print2(m);
		// m 班級有 A, B 二位學生
		// A 的考試成績 { 100, 90, 80 }
		// B 的考試成績 { 95, 85, 75 }
		// 請問 A 與 B 的平均各是多少 ? 班平均是多少 ?
		// Sol 1:
		double a_avg = com.study.day10.Util.getAvg(m[0]);
		double b_avg = com.study.day10.Util.getAvg(m[1]);
		System.out.printf("%.1f %.1f %.1f\n", 
				a_avg, b_avg, (a_avg + b_avg)/m.length);
		// Sol 2:
		// 將所有人的平均放到ㄧ維陣列中
		double[] avgs = new double[m.length];
		for(int i=0;i<avgs.length;i++) {
			double avg = com.study.day10.Util.getAvg(m[i]);
			avgs[i] = avg;
		}
		System.out.println("avgs = " + Arrays.toString(avgs));
		double avg = com.study.day10.Util.getAvg(avgs);
		System.out.println(avg);
	}

}
