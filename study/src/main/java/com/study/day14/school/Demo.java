package com.study.day14.school;

import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		Clazz c1 = new Clazz("Java", 8, 500);
		Clazz c2 = new Clazz("VB", 3, 300);
		Clazz c3 = new Clazz("IOT", 6, 400);
		
		Student s1 = new Student("John", 18);
		Student s2 = new Student("Mary", 19);
		Student s3 = new Student("Helen", 19);
		
		s1.addClazz(c1).addClazz(c2).addClazz(c3);
		s2.addClazz(c1).addClazz(c2);
		s3.addClazz(c3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		c1.setName("Python");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// 請問每一位學生的學分費各是多少 ?
		LinkedHashSet<Student> students = new LinkedHashSet<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println(students);
		
	}
}
