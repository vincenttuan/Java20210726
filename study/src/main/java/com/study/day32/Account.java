package com.study.day32;

// 帳號
public class Account {
	private int balance; // 帳戶餘額
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() { // 取得帳戶餘額
		return balance;
	}
	
	// withdraw 提款方法, amount 提款金額
	public void withdraw(int amount) { 
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 進來提款\n", tName);
		
		for(int i=0;i<999999999;i++); // 模擬提款所花費的時間
		
		System.out.printf("%s 離開提款\n", tName);
	}
	
}
