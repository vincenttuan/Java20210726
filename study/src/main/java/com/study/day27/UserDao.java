package com.study.day27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Dao : Data access object
// 處理資料問題
public class UserDao {
	
	public static final String PATH = "src/main/java/com/study/day27/data3.txt";
	
	public List<User> getUsers() throws FileNotFoundException {
		File file = new File(PATH);
		Scanner scanner = new Scanner(file).useDelimiter("\r\n");
		List<User> users = new ArrayList<>();
		while(scanner.hasNext()) {
			String row = scanner.next();
			Scanner scanner2 = new Scanner(row).useDelimiter(",");
			String username = scanner2.next();
			String password = scanner2.next();
			User user = new User(username, password);
			users.add(user);
		}
		return users;
	}
	
}
