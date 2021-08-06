package com.study.day24;

enum Sex2 { // 列舉
	man, female
}

public class CheckSexDemo2 {

	public static void main(String[] args) {
		showSex(Sex2.man);
		showSex(Sex2.female);
	}
	
	public static void showSex(Sex2 sex2) {
		switch (sex2) {
			case man: 
				System.out.println("男性");
				break;
			case female:
				System.out.println("女性");
				break;
		}
	}

}
