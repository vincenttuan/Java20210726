package com.study.day15;

import java.util.Random;

public class CompanyMain3 {
	
	public static void main(String[] args) {
		Employee employee = getEmployee();
		System.out.println(employee.getClass().getSimpleName());
	}
	
	// 隨機取出一個員工
	public static Employee getEmployee() {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		Random random = new Random();
		int n = random.nextInt(3); // 0, 1, 2
		switch (n) {
			case 0:
				return employee;
			case 1:
				return manager;
			case 2:
				return supervisor;
		}
		return null;
	}
	
}
