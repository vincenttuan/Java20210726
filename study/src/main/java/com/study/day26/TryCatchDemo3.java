package com.study.day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchDemo3 {

	public static void main(String[] args) {
		printData("src/main/java/com/study/day26/data.txt");
	}
	
	public static void printData(String fileName) {
		// 建立檔案
		File file = new File(fileName);
		Scanner scanner = null;
		try {
			// useDelimiter 資料的分隔符號[,]  預設是[空白]
			scanner = new Scanner(file).useDelimiter(",|-");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
			System.out.printf("%s 檔案找不到\n", fileName);
			return;
		}
		System.out.printf("%s 檔案找到了\n", fileName);
		// John,170.0,60,學生身高體重資料
		if(scanner != null) {
			String name = scanner.next(); 
			double height = scanner.nextDouble();
			int weight = scanner.nextInt();
			String other = scanner.nextLine(); // 剩下一直取到尾端 \n
			System.out.printf("%s %.1f %d %s\n", name, height, weight, other);
			 
		}
	}

}
