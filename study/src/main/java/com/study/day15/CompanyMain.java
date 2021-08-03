package com.study.day15;

public class CompanyMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		employee.salary = 4_0000;
		manager.salary = 7_0000;
		manager.budget = 20_0000;
		supervisor.salary = 30_0000;
		supervisor.budget = 100_0000;
		supervisor.stockOptions = 2000_0000;
		System.out.println(employee.salary);
		System.out.println(manager.salary);
		System.out.println(manager.budget);
		System.out.println(supervisor.salary);
		System.out.println(supervisor.budget);
		System.out.println(supervisor.stockOptions);
	}

}
