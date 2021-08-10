package com.study.day31;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Set<Integer>> {

	@Override
	public Set<Integer> call() throws Exception {
		Random r = new Random();
		// 取得 1~39 任意 5 個不重複號碼
		Set<Integer> nums = new LinkedHashSet<>();
		while (nums.size() < 5) {
			nums.add(r.nextInt(39) + 1);
		}
		return nums;
	}
	
}
