package com.study.day16;

class Animal {
	// 有帶參數的建構子
	Animal(int legs) {
		System.out.printf("Animal 有 %d 隻腳\n", legs);
	}
}


class Puppy {
	// 沒有帶參數的建構子或只有預設建構子
	Puppy() {
		
	}
}

class Dog extends Puppy {
	// 當繼承發生, 本地的建構子會自動呼叫 super()
}

class Cat extends Animal {
	// 當繼承發生, 本地的建構子會自動呼叫 super()
	Cat() {
		super(4); // 自己寫, 不可忘記 !
	}
}




public class ConstrustorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
