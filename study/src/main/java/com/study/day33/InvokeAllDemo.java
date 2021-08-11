package com.study.day33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {

	public static void main(String[] args) throws Exception {
		Callable<Integer> lotto = () -> new Random().nextInt(100);
		Collection<Callable<Integer>> list = new ArrayList<>();
		list.add(lotto);
		list.add(lotto);
		list.add(lotto);
		list.add(lotto);
		list.add(lotto);
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		// InvokeAll
		System.out.println("- InvokeAll -----------");
		List<Future<Integer>> resultList = service.invokeAll(list);
		for(Future<Integer> future : resultList) {
			System.out.println(future.get());
		}
		
		System.out.println("- InvokeAny -----------");
		int num = service.invokeAny(list);
		System.out.println(num);
		
	}

}
