package com.io;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		// 建立 data 資料夾
		File folder = new File("src/main/java/com/io/data");
		if(!folder.exists()) { // 若不存在
			boolean check = folder.mkdir(); // 建立目錄
			System.out.printf("建立目錄: %b\n", check);
		} else {
			System.out.println("目錄已經存在");
		}

	}

}
