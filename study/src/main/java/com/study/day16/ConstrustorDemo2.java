package com.study.day16;

class Bar {
	Bar() {
		System.out.println("Bar...");
	}
	
	Bar(int x) {
		System.out.println("Bar我也一定要執行..." + x);
	}
}

class Foo extends Bar {
	Foo() {
		super(100); // 自行撰寫
		System.out.println("Foo我一定要執行...");
	}
	Foo(int x) {
		this(); // 呼叫自己無參數的建構子, this() 一定要寫在第一行
		System.out.println("Foo..." + x);
	}
}

public class ConstrustorDemo2 {

	public static void main(String[] args) {
		//Foo foo1 = new Foo();
		Foo foo2 = new Foo(100);

	}

}
