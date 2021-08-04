package com.study.day16;
/*
 * static : 類別成員
 * instance : 物件成員
 * */

class Student {
	int age = 18;  // instance : 物件成員
	String name = "John"; // instance : 物件成員
	static String schoolName = "pcschool"; // static : 類別成員 
}

public class StaticAndInstance {
	public static void main(String[] args) {
		System.out.println(Student.schoolName);
		Student s1 = new Student();
		Student s2 = new Student();
		s2.age = 17;
		s2.name = "Mary";
		
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s2.age);
		System.out.println(s2.name);
		
		
	}
}
