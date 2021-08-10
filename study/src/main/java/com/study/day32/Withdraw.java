package com.study.day32;

// 提款執行緒
public class Withdraw implements Runnable {
	private Account account;
	private int amount;
	
	public Withdraw(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		account.withdraw(amount); // 執行提款方法
	}

}
