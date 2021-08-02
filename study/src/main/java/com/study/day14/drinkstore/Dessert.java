package com.study.day14.drinkstore;

public class Dessert {
	private String name;
	private Product product;
	private int amount;
	
	public Dessert() {
		
	} 
	
	public Dessert(String name, Product product, int amount) {
		this.name = name;
		this.product = product;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Dessert [name=" + name + ", product=" + product + ", amount=" + amount + "]";
	}
	
	
}
