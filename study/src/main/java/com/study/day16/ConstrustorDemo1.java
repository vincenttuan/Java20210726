package com.study.day16;

class Father {
	Father() {
		System.out.println("Father...");
	}
	Father(int x) {
		System.out.println("Father... " + x);
	}
}

class Son extends Father {
	Son() {
		System.out.println("Son...");
	}
	Son(int x) {
		super(x);
		System.out.println("Son... " + x);
	}
}

// 建構子的應用
public class ConstrustorDemo1 {
	
	public static void main(String[] args) {
		Son son1 = new Son();
		Son son2 = new Son(100);
		

	}

}
