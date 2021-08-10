package com.study.day31;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LottoMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		Lotto lotto = new Lotto();
		FutureTask<Set<Integer>> task = new FutureTask<>(lotto);
		// 建立執行緒執行 task
		new Thread(task).start();
		// 取得資料
		Set<Integer> nums = task.get();
		System.out.println(nums);

	}

}
