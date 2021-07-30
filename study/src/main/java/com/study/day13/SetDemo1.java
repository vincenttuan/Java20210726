package com.study.day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// 元素內容不可重複的動態陣列
public class SetDemo1 {

	public static void main(String[] args) {
		// 優點：新增、修改、刪除元素快
		// 查詢也快，但是略遜 TreeSet
		// 無序
		HashSet hs = new HashSet();
		hs.add("數學");
		hs.add("英文");
		hs.add("英文");
		hs.add("國文");	
		System.out.println(hs);
		
		// 有序
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("數學");
		lhs.add("英文");
		lhs.add("國文");	
		System.out.println(lhs);
		
		// 排序(自動依照內容大小自然排序)
		TreeSet tree = new TreeSet();
		tree.add(90);
		tree.add(100);
		tree.add(80);
		System.out.println(tree);
		
	}

}
