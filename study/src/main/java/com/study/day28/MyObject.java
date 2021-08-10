package com.study.day28;

public class MyObject {
	int size = 999999999;
	
	public MyObject() {
		System.out.println("MyObject construstor");
	}
	
	@Override
	public String toString() {
		return "MyObject [size=" + size + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("MyObject finalize");
	}
	
	public static void main(String[] args) {
		MyObject myObject = new MyObject();
		System.out.println(myObject);
		myObject = null;
		System.gc();
		// 接下來還有其他程式 ...
		// ...
	}
}
