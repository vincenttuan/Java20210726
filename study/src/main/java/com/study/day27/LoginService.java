package com.study.day27;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.function.Predicate;

// 處理商業邏輯問題
public class LoginService {
	
	public boolean loginCheck(String username, String password) 
			throws FileNotFoundException, LoginException {
		// 取得 List<User> users 的資料
		// 判斷 username 與 password
		UserDao dao = new UserDao();
		List<User> users = dao.getUsers();
		Predicate<User> check = u -> u.getUsername().equals(username) && u.getPassword().equals(password);
		boolean exist = users.stream()
						.filter(check)
						.findFirst()
						.isPresent();
		// 若 exist = false 則要拋出一個 LoginException 的例外物件
		if(!exist) {
			LoginException loginException = new LoginException("登入失敗 ...!");
			throw loginException; // 拋出一個 LoginException 的例外物件
		}
		return exist;
	}
}
