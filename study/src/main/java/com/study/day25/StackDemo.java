package com.study.day25;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		// 先進後出 Stack(堆疊)
		// 穿衣服
		Stack<String> stacks = new Stack<>();
		stacks.push("內衣");
		stacks.push("襯衫");
		stacks.push("外套");
		System.out.println(stacks);
		// 洗澡 脫衣服
		while(!stacks.isEmpty()) {
			String name = stacks.pop();
			System.out.printf("脫 %s 還剩: %s\n", name, stacks);
		}
		System.out.println(stacks);
	}
}
