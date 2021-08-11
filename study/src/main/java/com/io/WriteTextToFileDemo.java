package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFileDemo {

	public static void main(String[] args) {
		// 將文字資料寫入到檔案
		String data1 = "Happy Birthday";
		String data2 = "新年快樂";
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/main/java/com/io/data/hello.txt");
			fw.write(data1);
			fw.write("\r\n"); // 斷行
			fw.write(data2);
			System.out.println("寫入成功 !");
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 關閉資源
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
