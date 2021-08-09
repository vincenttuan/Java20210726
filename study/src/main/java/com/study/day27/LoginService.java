package com.study.day27;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.function.Predicate;

// 處理商業邏輯問題
public class LoginService {
	
	public boolean loginCheck(String username, String password) throws FileNotFoundException {
		// 取得 List<User> users 的資料
		// 判斷 username 與 password
		UserDao dao = new UserDao();
		List<User> users = dao.getUsers();
		Predicate<User> check = u -> u.getUsername().equals(username) && u.getPassword().equals(password);
		boolean exist = users.stream()
						.filter(check)
						.findFirst()
						.isPresent();
		return exist;
	}
}
