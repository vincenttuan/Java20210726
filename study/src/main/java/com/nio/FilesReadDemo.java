package com.nio;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesReadDemo {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("src/main/java/com/nio/salary.txt");
		
		// 1. Files.newBufferedReader
		System.out.println("-- 1. Files.newBufferedReader --");
		try(BufferedReader reader = Files.newBufferedReader(path)) {
			// BufferedReader 的優勢就是可以逐行讀取, 增加執行效率
			reader.lines().forEach(System.out::println);
		} catch (Exception e) {
		}
		System.out.println();
		
		// 2. Files.readAllLines (得到 List 集合)
		System.out.println("-- 2. Files.readAllLines --");
		List<String> list = Files.readAllLines(path);
		System.out.println(list);
		list.forEach(System.out::println);
		System.out.println();
		
		// 3. Files.lines (得到 java 8 的 Stream 串流)
		System.out.println("-- 3. Files.lines --");
		Files.lines(path).forEach(System.out::println);
		
	}

}
