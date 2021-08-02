package com.study.day14.drinkstore;

public class DrinkStore {
	public static void main(String[] args) {
		Product redTea = new Product("紅茶", 5);
		Product greenTea = new Product("綠茶", 6);
		Product milk = new Product("牛奶", 10);
		Product coffee = new Product("咖啡", 15);
		
		Drink milkTea = new Drink("奶茶", 1);
		milkTea.addProduct(redTea).addProduct(milk);
		
		Drink latte = new Drink("拿鐵", 1);
		latte.addProduct(coffee).addProduct(milk);
		
		System.out.println(milkTea);
		System.out.println(latte);
		
		// 試問我要買 10 杯 milkTea + 15 杯 latte 共要花多少錢 ?
		milkTea.setAmount(10);
		
	}
}

