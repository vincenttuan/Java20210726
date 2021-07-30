package com.study.day13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetDemo2 {

	public static void main(String[] args) {
		// 帳號申請
		LinkedHashSet acct = new LinkedHashSet();
		while(true) {
			System.out.printf("帳號資料( %d 筆): %s\n", acct.size(), acct);
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入新建帳號(exit 離開): ");
			String acctName = scanner.next();
			if(acctName.equalsIgnoreCase("exit")) {
				break;
			}
			if(acct.contains(acctName)) {
				System.out.println("該筆帳號已存在請重新輸入");
				continue;
			}
			acct.add(acctName);
			System.out.println("帳號建立成功");
		}
		System.out.println("離開本系統...");
	}

}
