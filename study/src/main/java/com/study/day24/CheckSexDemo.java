package com.study.day24;

interface Sex {
	int man = 1;
	int female = 2;
}

public class CheckSexDemo {

	public static void main(String[] args) {
		showSex(Sex.man);
		showSex(Sex.female);
		showSex(1);
		showSex(2);
		// 用錯參數 (在編譯時期不會先行告知)
		showSex(0);
		showSex(-100);
	}
	
	public static void showSex(int x) {
		switch (x) {
			case Sex.man: // 1
				System.out.println("男性");
				break;
			case Sex.female: // 2
				System.out.println("女性");
				break;
		}
	}

}

