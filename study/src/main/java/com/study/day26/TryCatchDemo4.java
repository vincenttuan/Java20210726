package com.study.day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchDemo4 {

	public static void main(String[] args) {
		// 請計算出在 data2.txt 中每一個人的 bmi 資料
		// 可以利用 useDelimiter("\n") 先切割出每一筆紀錄
		// 再透過 Scanner 的 nextXXX 取資料
		printBMI("src/main/java/com/study/day26/data2.txt");
	}
	
	public static void printBMI(String fileName) {
		File file = new File(fileName);
		if(file.exists()) {
			try {
				// 透過 useDelimiter("\n\r") 切分有幾筆資料
				// window 的斷行指令 \n\r
				Scanner scanner = new Scanner(file).useDelimiter("\n\r");
				while(scanner.hasNext()) {
					String row = scanner.next();
					System.out.println(row); // John,170,60,身高體重資料
					//-----------------------------------------------------
					// 再透過 useDelimiter(",") 切分有每一個欄位資料
					Scanner scanner2 = new Scanner(row).useDelimiter(",");
					String name = scanner2.next();
					double h = scanner2.nextInt();
					double w = scanner2.nextInt();
					double bmi = w / Math.pow(h/100, 2);
					System.out.printf("%s bmi: %.2f\n", name,bmi);
				}
			} catch (FileNotFoundException e) {
				// TODO: handle exception
			}
		}
	}

}
