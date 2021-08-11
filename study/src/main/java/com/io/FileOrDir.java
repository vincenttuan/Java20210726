package com.io;

import java.io.File;

public class FileOrDir {

	public static void main(String[] args) {
		File path = new File("src/main/java/com/study/day14");
		String[] names = path.list();
		
		for(String name : names) {
			// 組合成完整路徑
			File f = new File(path + File.separator + name);
			String value = f.isDirectory() ? "目錄" : "檔案";
			System.out.println(name + " 是" + value);
		}

	}

}
