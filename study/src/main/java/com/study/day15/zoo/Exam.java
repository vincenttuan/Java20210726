package com.study.day15.zoo;

class C1 {}
class C2 extends C1 {}
class C3 extends C2 {}

public class Exam {

	public static void main(String[] args) {
		C1 obj1 = (C1)new C2(); // OK
		C2 obj2 = (C2)new C3(); // OK
		C2 obj3 = (C2)new C1(); // 錯誤, C2 obj3 = new C1();
		C3 obj4 = (C3) obj2; // OK, C3 obj4 = new C3()
	}

}
