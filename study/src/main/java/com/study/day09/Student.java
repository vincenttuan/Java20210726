package com.study.day09;

public class Student {
	static String schoolName; // 校名
	String name; // 學生姓名
	int age; // 學生年齡
	
	@Override
	public String toString() {
		return schoolName + ", Student [name=" + name + ", age=" + age + "]";
	}
	
}
