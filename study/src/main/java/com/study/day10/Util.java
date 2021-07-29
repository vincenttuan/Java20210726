package com.study.day10;

import java.util.Random;

// 共用的工具程式
public class Util {
	// 計算總分
	public static int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static int getSum(double[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	// 計算平均
	public static double getAvg(int[] array) {
		int sum = getSum(array);
		double avg = sum / (double) array.length;
		return avg;
	}
	
	public static double getAvg(double[] array) {
		int sum = getSum(array);
		double avg = sum / (double) array.length;
		return avg;
	}

	// 最高分
	public static int getMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	// 最低分
	public static int getMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	// 由小到大排序
	public static void sortASC(int[] array) {
		for (int count = 0; count < array.length - 1; count++) {
			for (int i = 0; i < array.length - 1; i++) {
				int a = array[i];
				int b = array[i + 1];
				if (b < a) {
					array[i] = b;
					array[i + 1] = a;
				}
			}
		}
	}

	// 由大到小排序
	public static void sortDESC(int[] array) {
		for (int count = 0; count < array.length - 1; count++) {
			for (int i = 0; i < array.length - 1; i++) {
				int a = array[i];
				int b = array[i + 1];
				if (b > a) {
					array[i] = b;
					array[i + 1] = a;
				}
			}
		}
	}

	// 洗牌
	public static void shuffle(int[] array) {
		// 洗牌邏輯(隨機)
		for (int count = 0; count < array.length; count++) {
			// 任意二組資料交換
			Random random = new Random();
			int i = random.nextInt(array.length);
			int j = random.nextInt(array.length);
			int a = array[i];
			int b = array[j];
			array[i] = b;
			array[j] = a;
		}
	}
	
	// 標準差
	public static double getSD(int[] array) {
		double h_avg = Util.getAvg(array);
		double h_sum = 0;
		for(int i=0;i<array.length;i++) {
			h_sum += Math.pow(array[i]-h_avg, 2);
		}
		double sd = Math.sqrt(h_sum / array.length);
		return sd;
	}
	
	public static double getSD(double[] array) {
		double h_avg = Util.getAvg(array);
		double h_sum = 0;
		for(int i=0;i<array.length;i++) {
			h_sum += Math.pow(array[i]-h_avg, 2);
		}
		double sd = Math.sqrt(h_sum / array.length);
		return sd;
	}
	
	// 變異係數 CV
	public static double getCV(int[] array) {
		double cv = getSD(array) / getAvg(array);
		return cv;
	}
	
	public static double getCV(double[] array) {
		double cv = getSD(array) / getAvg(array);
		return cv;
	}

}
