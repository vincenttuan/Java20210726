package com.study.day27;

import java.io.FileNotFoundException;

public class LoginMain {

	public static void main(String[] args) {
		// 寫一個 boolean loginCheck(String username, String password)
		// 若輸入 loginCheck("John", "1234") 則得到 true
		// 若輸入 loginCheck("Mary", "1111") 則得到 false
		// 若輸入 loginCheck("Helen", "1111") 則得到 false
		LoginService service = new LoginService();
		String username = "John";
		String password = "12342";
		boolean check = false;
		try {
			check = service.loginCheck(username, password);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("檔案找不到的錯誤");
		}
		System.out.println(check);
	}
	
}
