package com.study.day33;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskMain {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newCachedThreadPool();
		//ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(new Task()); // 一般任務
		service.submit(new LongTask()); // 長任務
		service.submit(new Task()); // 一般任務
		service.submit(new Task()); // 一般任務
		service.submit(new LongTask()); // 長任務
		service.submit(new LongTask()); // 長任務
		service.submit(new Task()); // 一般任務
		System.out.println(Thread.activeCount()); // 主 + 子執行緒
		
		service.shutdown(); // 執行緒池內的工作做完就會關閉
		
		// 每一秒鐘去偵測到底工作做完沒有(執行緒池有無關閉) ?
		while(!service.awaitTermination(1, TimeUnit.SECONDS)) {
			System.out.println("工作還沒做完(執行緒池尚未關閉)");
		}
		System.out.println("工作做完(執行緒池關閉), 程式結束 !");
		
	}
}
