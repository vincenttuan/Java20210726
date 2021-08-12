package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

// 遍歷所有檔案資料
public class WalkPath {

	public static void main(String[] args) throws IOException {
		
		// user.home 就是家目錄
		//Path path = Paths.get(System.getProperty("user.home"));
		Path path = Paths.get("src/main/java");
		Stream<Path> paths = Files.walk(path);
		paths.forEach(p -> {
			try {
				Path aPath = p.toAbsolutePath();
				// 絕對路徑
				System.out.print(aPath + " : ");
				// 建立時間
			    System.out.println(Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
	            
			} catch (Exception e) {
				// TODO: handle exception
			}
		});

	}

}
