package com.study.day26;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

enum MapKey {
	name, h, w
}

public class TryCatchDemo5 {

	public static void main(String[] args) {
		// 請計算出在 data2.txt 中每一個人的 bmi 資料
		// 可以利用 useDelimiter("\n") 先切割出每一筆紀錄
		// 再透過 Scanner 的 nextXXX 取資料
		try {
			printBMI("src/main/java/com/study/day26/data2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void printBMI(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file).useDelimiter("\r\n");
		List<Map> list = getListMapData(scanner);
		// 印出
		list.forEach(m -> System.out.printf("%s bmi=%.2f\n",
							m.get(MapKey.name),
							getBMI(m.get(MapKey.h), m.get(MapKey.w))
				));
	}
	
	private static double getBMI(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}
	
	private static double getBMI(Object h, Object w) {
		return getBMI(Double.parseDouble(h.toString()), Double.parseDouble(w+""));
	}
	
	/*
	John,170,60  <-- row
	Mary,150,50  <-- row
	Bobo,180,70  <-- row
	將資料結構化
	[
		{"name": John, "h": 170.0, "w": 60.0},
		{"name": Mary, "h": 150.0, "w": 50.0},
		{"name": Bobo, "h": 180.0, "w": 70.0},
	]
	*/
	private static List<Map> getListMapData(Scanner scanner) {
		List<Map> list = new ArrayList();
		while(scanner.hasNext()) {
			String row = scanner.next();
			Scanner scanner2 = new Scanner(row).useDelimiter(",");
			String name = scanner2.next();
			double h = scanner2.nextInt();
			double w = scanner2.nextInt();
			Map map = new LinkedHashMap();
			map.put(MapKey.name, name);
			map.put(MapKey.h, h);
			map.put(MapKey.w, w);
			list.add(map);
		}
		return list;
	}
	
	

}
