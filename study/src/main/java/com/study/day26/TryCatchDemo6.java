package com.study.day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TryCatchDemo6 {

	public static void main(String[] args) {
		try {
			printBMI("src/main/java/com/study/day26/data2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void printBMI(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file).useDelimiter("\r\n");
		List<Person> people = getPeople(scanner);
		setBmiValue(people);
		System.out.println(people);
	}
	
	private static double getBMI(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}
	
	public static void setBmiValue(List<Person> people) {
		// 設定/計算每一個 person 的 bmi 值
		people.forEach(p -> p.setBmi(getBMI(p.getH(), p.getW())));
	}
	
	public static List<Person> getPeople(Scanner scanner) {
		List<Person> people = new ArrayList<>();
		while(scanner.hasNext()) {
			String row = scanner.next();
			Scanner scanner2 = new Scanner(row).useDelimiter(",");
			String name = scanner2.next();
			double h = scanner2.nextInt();
			double w = scanner2.nextInt();
			Person person = new Person(name, h, w);
			people.add(person);
		}
		
		return people;
	}

}
