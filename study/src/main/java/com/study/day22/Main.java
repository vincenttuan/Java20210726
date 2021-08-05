package com.study.day22;

class Outer {
	
	class Inner {
		void job() {
			System.out.println("java...");
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
