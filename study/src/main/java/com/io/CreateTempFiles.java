package com.io;

import java.io.File;
import java.io.IOException;

public class CreateTempFiles {

	public static void main(String[] args) {
		// 建立暫存檔資料夾
		File folder = new File("src/main/java/com/io/temp");
		if(!folder.exists()) {
			folder.mkdir();
		}
		// 建立暫存檔
		for(int i=1;i<=10;i++) {
			try {
				// tempXXXXXXX.txt  , XXXXXXX 代表序號
				File tmpFile = File.createTempFile("temp", ".txt", folder);
				System.out.println(tmpFile + " 存在? " + tmpFile.exists());
			} catch (IOException e) {
				System.out.println("建立檔案錯誤: " + e);
			}
			
		}

	}

}
