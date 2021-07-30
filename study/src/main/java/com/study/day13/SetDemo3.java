package com.study.day13;

import java.util.LinkedHashSet;
import java.util.Scanner;

// 建立帳號系統
// 1. 新建帳號不可重複
// 2. 移除帳號時必須帳號要存在
// 3. 新建帳號指令: +帳號
// 4. 移除帳號指令: -帳號

public class SetDemo3 {

	public static void main(String[] args) {
		LinkedHashSet acct = new LinkedHashSet();
		while (true) {
			System.out.printf("帳號資料( %d 筆): %s\n", acct.size(), acct);
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入(+帳號, -帳號, exit): ");
			String data = scanner.nextLine();
			if(data.equalsIgnoreCase("exit")) {
				break;
			}
			switch (data.charAt(0)) {
				case '+':
					String addAcctName = data.substring(1);
					if(acct.contains(addAcctName)) {
						System.out.println("帳號已存在無法新增，請重新輸入");
						continue;
					}
					// 去除左右二邊的空白
					addAcctName = addAcctName.trim();
					// 判斷字的中間是否空白
					if(addAcctName.indexOf(" ") != -1) {
						System.out.println("帳號中間不可有空白");
						continue;
					}
					acct.add(addAcctName);
					System.out.println("帳號新增成功");
					break;
				case '-':
					String removeAcctName = data.substring(1);
					if(!acct.contains(removeAcctName)) {
						System.out.println("帳號不存在無法移除，請重新輸入");
						continue;
					}
					acct.remove(removeAcctName);
					System.out.println("帳號移除成功");
					break;	
				default:
					System.out.println("輸入錯誤，請重新輸入 !");
					continue;
			}
		}
		
		System.out.println("離開本系統...");
	}

}
