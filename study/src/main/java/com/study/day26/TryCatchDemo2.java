package com.study.day26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		input();
	}
	
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("假設 分子=10 請輸入分母: ");
		int result = 0; // 結果
		int x = 10; // 分子
		try {
			int y = scanner.nextInt(); // 分母
			// 檢查 y 是否 = 0 ?
			if(y == 0) {
				System.out.println("分母不可 = 0");
				return; // 停止此方法
			}
			result = x / y;
			System.out.printf("x=%d y=%d result=%d\n", x, y, result);
		} catch (InputMismatchException e) {
			System.out.println("請輸入數字");
			input(); // 重新執行 input() 這種寫法叫做遞迴(自己呼叫自己)
		} finally { // 不論是否有錯誤發生, 都會執行
			System.out.println("結束");
		}
		
	}
}
