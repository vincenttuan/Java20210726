package com.study.day14.drinkstore;

import java.util.LinkedHashSet;

public class DrinkStore {
	public static void main(String[] args) {
		Product redTea = new Product("紅茶", 5);
		Product greenTea = new Product("綠茶", 6);
		Product milk = new Product("牛奶", 10);
		Product coffee = new Product("咖啡", 15);
		
		// menu
		Drink milkTea = new Drink("奶茶", 1);
		milkTea.addProduct(redTea).addProduct(milk);
		
		Drink latte = new Drink("拿鐵", 1);
		latte.addProduct(coffee).addProduct(milk);
		
		Drink blackCoffee = new Drink("黑咖啡", 1);
		blackCoffee.addProduct(coffee);
		
		
		// order 定單
		// 試問我要買 10 杯 milkTea + 15 杯 latte 共要花多少錢 ?
		milkTea.setAmount(10);
		latte.setAmount(15);
		System.out.println(milkTea);
		System.out.println(latte);
		LinkedHashSet<Drink> drinks = new LinkedHashSet<Drink>();
		drinks.add(milkTea);
		drinks.add(latte);
		int price = drinks.stream()
				.mapToInt(drink -> drink.getAmount() * 
						           drink.getProducts().stream().mapToInt(Product::getPrice).sum())
				.sum();
		System.out.println(price);
		// 請問此筆訂單商家賺了多少 ?
		int cost = drinks.stream()
				.mapToInt(drink -> drink.getAmount() * 
						           drink.getProducts().stream().mapToInt(Product::getCost).sum())
				.sum();
		System.out.printf("成本: $%,d 銷售: $%,d 獲利: $%,d\n", cost, price, (price - cost));
		
	}
}

