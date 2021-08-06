package com.study.day25;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		// 先進先出
		Queue<String> queue = new LinkedList<>();
		queue.offer("紅茶");
		queue.offer("奶茶");
		queue.offer("咖啡");
		System.out.println(queue);
		// 取出
		while(!queue.isEmpty()) {
			// 喝飲料
			String name = queue.poll();
			// 剩餘飲料
			System.out.printf("喝: %s 剩下: %s\n", name, queue);
		}
		System.out.printf("最後: %s\n", queue);
		
	}
}
