package com.study.day12;

public class WrapperDemo1 {

	public static void main(String[] args) {
		String checkString = "True";
		
		boolean check = Boolean.valueOf(checkString).booleanValue();
		
		boolean check2 = Boolean.valueOf(checkString); 
		              // Boolean -> boolean auto-unboxing 自動拆箱
		              // Boolean.valueOf(checkString).booleanValue();
		
		System.out.println(check);
		System.out.println(check2);
		
		Boolean check3 = Boolean.valueOf("true");
		Boolean check4 = true;
		                // boolean -> Boolean auto-boxing 自動裝箱
						// Boolean.valueOf("true")
		
	}

}
