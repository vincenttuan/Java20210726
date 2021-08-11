package com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteTextToFileDemo2 {

	public static void main(String[] args) {
		// 將文字資料寫入到檔案
		String data1 = "Happy Birthday";
		String data2 = "新年快樂";
		// 使用 try-with-resource 語法會自動 close() 資源
		try(FileWriter fw = new FileWriter("src/main/java/com/io/data/hello.txt")) {
			fw.write(data1);
			fw.write("\r\n"); // 斷行
			fw.write(data2);
			fw.write("\r\n"); // 斷行
			System.out.println("寫入成功 !");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
