package com.study.day25;

import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {
		String text = "Java";
		char[] chars = text.toCharArray();
		Stack<Character> stacks = new Stack<>();
		for(int i=0;i<chars.length;i++) {
			stacks.push(chars[i]);
		}
		System.out.println(stacks);
		
		while(!stacks.isEmpty()) {
			System.out.print(stacks.pop());
		}

	}

}
