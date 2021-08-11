package com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteTextToFileDemo {

	public static void main(String[] args) {
		// 將文字資料寫入到檔案
		String data1 = "Happy Birthday";
		String data2 = "新年快樂";
		
		FileWriter fw = null;
		try {
			// true 保留原檔案內容, false(預設) 清除原檔案內容
			//fw = new FileWriter("src/main/java/com/io/data/hello.txt", true);
			//fw = new FileWriter("src/main/java/com/io/data/hello.txt", false);
			fw = new FileWriter("src/main/java/com/io/data/hello.txt");
			fw.write(data1);
			fw.write("\r\n"); // 斷行
			fw.write(data2);
			fw.write("\r\n"); // 斷行
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
