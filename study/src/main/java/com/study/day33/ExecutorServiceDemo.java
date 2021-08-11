package com.study.day33;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("在 run() 得到 10");
		return;
	}
}

class MyCallable implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		System.out.println("在 call() 得到 20");
		return 20;
	}
}

public class ExecutorServiceDemo {

	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newCachedThreadPool();
		Future f1 = service.submit(new MyRunnable());
		Future f2 = service.submit(new MyCallable());
		System.out.println(f1.get() + ", " + f2.get());
		service.shutdown();

	}

}
