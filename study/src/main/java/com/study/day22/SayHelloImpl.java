package com.study.day22;

public class SayHelloImpl implements SayHello {

	@Override
	public void hello(String name) {
		System.out.println("Hello " + name);
	}

}
