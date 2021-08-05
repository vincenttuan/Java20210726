package com.study.day22;

public class SayHelloMain {
	public static void main(String[] args) {
		// case 1
		SayHello sayHello = new SayHelloImpl();
		sayHello.hello("John");
		
		// case 2 使用匿名內部類別
		
		SayHello sayHello2 = new SayHello() {

			@Override
			public void hello(String name) {
				System.out.println("Hi " + name);
			}
			
		};
		
		sayHello2.hello("Mary");
	}
	
}
