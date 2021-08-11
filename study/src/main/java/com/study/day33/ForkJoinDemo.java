package com.study.day33;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Sum extends RecursiveAction {
	// 門檻值
	static final int THRESHOLD_SIZE = 3;
	int stIndex, lstIndex;
	int[] data;
	public Sum(int[] data, int start, int end) {
		this.data = data;
		this.stIndex = start;
		this.lstIndex = end;
	}
	
	@Override
	protected void compute() {
		int sum = 0;
		if(lstIndex - stIndex <= THRESHOLD_SIZE) { // 滿足門檻值進行計算
			for(int i = stIndex; i < lstIndex ; i++) {
				sum += data[i];
			}
			System.out.printf("sum=%d\n", sum);
		} else { // 拆分
			System.out.printf("拆分(1) %d, %d\n", stIndex + THRESHOLD_SIZE, lstIndex);
			new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
			System.out.printf("拆分(2) %d, %d\n", stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE));
			new Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute();
		}
		
	}
}

public class ForkJoinDemo {

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		pool.invoke(new Sum(data, 0, data.length));

	}

}
