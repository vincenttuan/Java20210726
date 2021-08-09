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
			Scanner scanner = null;
			try {
				scanner = new Scanner(file).useDelimiter("\n");
				while(scanner.hasNext()) {
					String row = scanner.next().trim();
					System.out.println(row);
				}
			} catch (FileNotFoundException e) {
				// TODO: handle exception
			}
		}
	}

}
