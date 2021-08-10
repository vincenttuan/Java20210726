package com.study.day28;

public class AssertTest {

	public static void main(String[] args) {
		int score = 40;
		
		// assert(false) : 才會執行
		// assert 若要運作在執行此程式要下達 -ea 的參數
		assert(score >= 60) : score + "不及格";
		
		System.out.println(score + " 及格");

	}

}
