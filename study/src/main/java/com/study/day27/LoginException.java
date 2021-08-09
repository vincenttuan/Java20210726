package com.study.day27;

public class LoginException extends Exception {

	public LoginException(String message) {
		super(message);
		
	}
	
	// 自訂一個方法
	public void 登入失敗怎麼辦() {
		System.out.println("請來電客服專線: 03-347-4878");
	}
	
}
