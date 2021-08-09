package com.study.day26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo1 {

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
			result = x / y;
			System.out.printf("x=%d y=%d result=%d\n", x, y, result);
		} catch (InputMismatchException e) {
			System.out.println("請輸入數字");
			input(); // 重新執行 input() 這種寫法叫做遞迴(自己呼叫自己)
		} catch (ArithmeticException e) {
			System.out.println(e); // 錯誤類型 + 錯誤內容
			System.out.println(e.getMessage()); // 錯誤內容
			e.printStackTrace(System.out); // 更詳細的錯誤內容
			System.out.println("分母不可以 = 0"); // 自訂錯誤內容
		}
		System.out.println("結束");
	}
}
