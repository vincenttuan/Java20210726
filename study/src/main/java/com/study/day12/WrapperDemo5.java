package com.study.day12;

import java.util.Arrays;

public class WrapperDemo5 {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", 20, 40000);
		Employee e2 = new Employee("Mary", 30, 50000);
		Employee e3 = new Employee("Helen", 25, null);
		Employee e4 = new Employee("Jim", 40, 60000);
		Employee e5 = new Employee("Jack", 35, 55000);
		
		// 試問公司平均年齡 = ?
		Employee[] employees = {e1, e2, e3, e4, e5};
		
		double avgOfAge = Arrays.stream(employees)
			//.peek(System.out::println)
			.mapToInt(Employee::getAge)
			//.peek(System.out::println)
			.average()
			.getAsDouble();
		System.out.println(avgOfAge);
		
	}

}
