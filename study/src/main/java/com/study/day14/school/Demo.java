package com.study.day14.school;

public class Demo {
	public static void main(String[] args) {
		Clazz c1 = new Clazz("Java", 8, 500);
		Clazz c2 = new Clazz("VB", 3, 300);
		Clazz c3 = new Clazz("IOT", 6, 400);
		
		Student s1 = new Student("John", 18);
		Student s2 = new Student("Mary", 19);
		Student s3 = new Student("Helen", 19);
		
		s1.addClazz(c1).addClazz(c2).addClazz(c3);
		System.out.println(s1);
		
	}
}
