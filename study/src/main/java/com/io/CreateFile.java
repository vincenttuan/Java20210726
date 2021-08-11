package com.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file = new File("src/main/java/com/io/data/hello.txt");
		if(!file.exists()) {
			try {
				boolean check = file.createNewFile();
				System.out.printf("檔案建立: %b\n", check);
			} catch (IOException e) {
				System.out.println("檔案建立錯誤: " + e);
			}
		} else {
			System.out.println("檔案已存在!");
		}

	}

}
