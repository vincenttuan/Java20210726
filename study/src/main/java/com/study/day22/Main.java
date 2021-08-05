package com.study.day22;

class Outer {
	int x = 7; // Outer's 物件變數
	class Inner {
		int x = 77; // Inner's 物件變數
		void job() {
			int x = 777; // job() 方法的區域變數
			System.out.println("java...");
			System.out.println("區域變數 x = " + x);
			System.out.println("Inner's 物件變數 x = " + this.x);
			System.out.println("Outer's 物件變數 x = " + Outer.this.x);
		}
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.job();
	}
}
