package com.study.day09;

public class HelloStudent {

	public static void main(String[] args) {
		Student.schoolName = "pcschool";
		Student s1 = new Student();
		s1.name = "John";
		s1.age = 18;
		Student s2 = new Student();
		s2.name = "Mary";
		s2.age = 17;
		System.out.println(s1);
		System.out.println(s2);
	}

}
