package com.io;

import java.io.File;

public class CreateFolders {

	public static void main(String[] args) {
		// 建立 aaa/bbb/ccc 多重資料夾
		File folder = new File("src/main/java/com/io/aaa/bbb/ccc");
		if(!folder.exists()) { // 若不存在
			boolean check = folder.mkdirs(); // 建立目錄(s)
			System.out.printf("建立目錄: %b\n", check);
		} else {
			System.out.println("目錄已經存在");
		}

	}

}
