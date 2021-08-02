package com.study.day14.drinkstore;

import java.util.LinkedHashSet;

public class Drink {
	private String name;
	private LinkedHashSet<Product> products = new LinkedHashSet<>();
	private int amount;
	
	public Drink() {
	}
	
	public Drink(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedHashSet<Product> getProducts() {
		return products;
	}

	public void setProducts(LinkedHashSet<Product> products) {
		this.products = products;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Drink addProduct(Product product) {
		products.add(product);
		return this;
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", products=" + products + ", amount=" + amount + "]";
	}
	
	
}
