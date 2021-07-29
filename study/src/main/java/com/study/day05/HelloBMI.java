package com.study.day05;

public class HelloBMI {

	public static void main(String[] args) {
		BMI b1 = new BMI("John", 170, 60);
		// 查看目前的屬性資料
//		System.out.println(b1.getName());
//		System.out.println(b1.getHeight());
//		System.out.println(b1.getWeight());
//		System.out.println(b1.getBmi());
		System.out.println(b1);
		
		// 變更身高
		b1.setHeight(180);
		// 查看目前的屬性資料
		System.out.println(b1);
		
	}

}
