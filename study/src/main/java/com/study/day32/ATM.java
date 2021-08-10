package com.study.day32;

public class ATM {

	public static void main(String[] args) {
		Account account = new Account(10000);
		// 提款工作
		Withdraw w5 = new Withdraw(account, 5000);
		Withdraw w4 = new Withdraw(account, 4000);
		Withdraw w3 = new Withdraw(account, 3000);
		
		// 找人提款
		Thread t1 = new Thread(w5, "小明");
		Thread t2 = new Thread(w4, "小華");
		Thread t3 = new Thread(w3, "小英");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
