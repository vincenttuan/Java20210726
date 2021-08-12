package com.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {
	public static void main(String[] args) throws Exception {
		Path source = Paths.get("src/main/java/com/nio/salary.txt");
		Path dest   = Paths.get("src/main/java/com/nio/salary_2.txt");
		
		//Files.copy(source, dest);
		Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Copy 成功 !");
	}
}
