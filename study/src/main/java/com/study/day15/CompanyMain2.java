package com.study.day15;

public class CompanyMain2 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		employee.salary = 4_0000;
		manager.salary = 7_0000;
		supervisor.salary = 15_0000;
		// 調用(呼叫)列印薪資單方法
		printSalary(employee);
		printSalary(manager);
		printSalary(supervisor);
	}
	
	// 列印薪資單
	public static void printSalary(Employee employee) {
		System.out.printf("列印員工薪資單: $%,d\n", employee.salary);
	}
	public static void printSalary(Manager manager) {
		System.out.printf("列印員工薪資單: $%,d\n", manager.salary);
	}
	public static void printSalary(Supervisor supervisor) {
		System.out.printf("列印員工薪資單: $%,d\n", supervisor.salary);
	}

}
