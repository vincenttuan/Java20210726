package com.nio;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesReadDemo {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("src/main/java/com/nio/salary.txt");
		// 1. Files.newBufferedReader
		System.out.println("---- 1. Files.newBufferedReader ----");
		try(BufferedReader reader = Files.newBufferedReader(path)) {
			// BufferedReader 的優勢就是可以逐行讀取, 增加執行效率
			reader.lines().forEach(System.out::println);
		} catch (Exception e) {
		}
		System.out.println();
		
		
		
	}

}
