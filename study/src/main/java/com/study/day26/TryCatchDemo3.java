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
		try {
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
			System.out.printf("%s 檔案找不到\n", fileName);
			return;
		}
		System.out.printf("%s 檔案找到了\n", fileName);
	}

}
