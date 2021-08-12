package com.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
	public static void main(String[] args) throws Exception {
		Path source = Paths.get("src/main/java/com/nio/salary.txt");
		Path dest   = Paths.get("src/main/java/com/nio/salary_2.txt");
		
		Files.copy(source, dest);
		System.out.println("Copy 成功 !");
	}
}
